package com.thread.samples.lock.reentrantLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁示例
 * 如果用同步的话，读业务之间也是要等待的，用读写锁可以解决只读业务的并发执行
 * 不过读和先之间，写和写之间依然需要等待
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
				System.out.println(thread.getName() + "正在进行读操作");
			}
			System.out.println(thread.getName() + "读操作完毕");
		}finally{
			rwLock.readLock().unlock();
		}
	}
}
