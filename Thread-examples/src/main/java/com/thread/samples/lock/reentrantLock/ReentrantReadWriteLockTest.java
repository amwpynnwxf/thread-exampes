package com.thread.samples.lock.reentrantLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ��д��ʾ��
 * �����ͬ���Ļ�����ҵ��֮��Ҳ��Ҫ�ȴ��ģ��ö�д�����Խ��ֻ��ҵ��Ĳ���ִ��
 * ����������֮�䣬д��д֮����Ȼ��Ҫ�ȴ�
 * @author wuyouwulv
 *
 */
public class ReentrantReadWriteLockTest {
	private ReadWriteLock rwLock = new ReentrantReadWriteLock();
	
	public static void main(String[] args) {
		final ReentrantReadWriteLockTest test = new ReentrantReadWriteLockTest();
		new Thread(){
			public void run(){
				test.get(Thread.currentThread());
			}
		}.start();
		
		new Thread(){
			public void run(){
				test.get(Thread.currentThread());
			}
		}.start();
	}

	public void get(Thread thread){
		rwLock.readLock().lock();
		try{
			long start = System.currentTimeMillis();
			while(System.currentTimeMillis() - start <= 500){
				System.out.println(thread.getName() + "���ڽ��ж�����");
			}
			System.out.println(thread.getName() + "���������");
		}finally{
			rwLock.readLock().unlock();
		}
	}
}
