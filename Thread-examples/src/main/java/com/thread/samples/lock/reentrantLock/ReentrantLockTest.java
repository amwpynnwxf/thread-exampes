package com.thread.samples.lock.reentrantLock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ��������ʾ��
 * �ÿ�������ģ��synchronized��ʹ��
 * @author wuyouwulv
 *
 */
public class ReentrantLockTest {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	Lock lock = new ReentrantLock();
	
	public static void main(String[] args){
		ReentrantLockTest reentrantLockWrong = new ReentrantLockTest();
		new Thread(){
			public void run(){
				reentrantLockWrong.insert(Thread.currentThread());
			}
		}.start();
		
		new Thread(){
			public void run(){
				reentrantLockWrong.insert(Thread.currentThread());
			}
		}.start();
	}
	
	private void insert(Thread thread){
		//Lock lock = new ReentrantLock();// ���ڴ˴�����Ч����Ϊ���̵߳�������ͬһ��
		lock.lock();
		try{
			System.out.println(thread.getName() + "�õ�����");
			for(int i=0; i<5; i++){
				list.add(i);
			}
		}finally{
			System.out.println(thread.getName() + "�ͷ�����");
			lock.unlock();
		}
	}
}
