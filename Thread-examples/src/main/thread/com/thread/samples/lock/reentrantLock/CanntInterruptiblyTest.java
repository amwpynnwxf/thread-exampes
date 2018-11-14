package com.thread.samples.lock.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronized�޷����ж�
 * ����synchronized��˵�����һ���߳��ڵȴ�������ô���ֻ�����֣�Ҫô��������������ִ�У�Ҫô���ͱ���ȴ�����ʹ�����ж��̵߳ķ�����Ҳ������Ч��
 * @author wuyouwulv
 *
 */
public class CanntInterruptiblyTest {
	Lock lock = new ReentrantLock();
	public static void main(String[] args){
		CanntInterruptiblyTest test = new CanntInterruptiblyTest();
		TheThread thread1 = new TheThread(test);
		TheThread thread2 = new TheThread(test);
		thread1.start();
		thread2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread1.interrupt();
	}
	
	public void insert(Thread thread) {
		synchronized(this){
			System.out.println(thread.getName() + "����ͬ����");
			while(true){//Never releases lock, ��ǰ�߳�����ѭ������ִ��Ȩ-���ִ��Ȩ
				Thread.yield();// �ó�ִ��Ȩ�����Լ������������̼߳�������ִ��Ȩ
			}
		}
	}
	
}

class TheThread extends Thread{
	private CanntInterruptiblyTest test;
	public TheThread(CanntInterruptiblyTest test){
		this.test = test;
	}
	
	@Override
	public void run() {
		while(true){
			if(Thread.interrupted()){
				System.out.println("�ж��߳�!!");
                break;
			}else{
				test.insert(Thread.currentThread());
			}
		}
	}
	
}