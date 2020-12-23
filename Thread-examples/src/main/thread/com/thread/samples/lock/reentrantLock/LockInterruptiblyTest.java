package com.thread.samples.lock.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ���������Ŀ��ж���Ӧ����
 * @author wuyouwulv
 *
 */
public class LockInterruptiblyTest {
	Lock lock = new ReentrantLock();
	public static void main(String[] args){
		LockInterruptiblyTest test = new LockInterruptiblyTest();
		MyThread thread1 = new MyThread(test);
		MyThread thread2 = new MyThread(test);
		thread1.start();
		thread2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread2.interrupt();// �ж��߳�
	}
	
	public void insert(Thread thread) throws InterruptedException{
		lock.lockInterruptibly();// ��ȡ����ͬʱ���ж���Ӧ�����������lock(),����tryLock()�������ⲿ��interrupt���޷��ж�
		try{
			System.out.println(thread.getName() + "�������");
			Thread.sleep(4000);
		}finally{
			lock.unlock();
			System.out.println(thread.getName() + "�ͷ�����");
		}
	}
	
}

class MyThread extends Thread{
	private LockInterruptiblyTest test;
	public MyThread(LockInterruptiblyTest test){
		this.test = test;
	}
	
	@Override
	public void run() {
		try{
			test.insert(Thread.currentThread());
		}catch(InterruptedException e){
			//e.printStackTrace();
			System.out.println(Thread.currentThread().getName() + "���ж���");
		}
	}
	
}