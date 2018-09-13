package com.thread.samples.lock.reentrantLock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁示例
 * 用可重入锁模拟synchronized的使用
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
		//Lock lock = new ReentrantLock();// 放在此处锁无效，因为多线程的锁不是同一个
		lock.lock();
		try{
			System.out.println(thread.getName() + "得到了锁");
			for(int i=0; i<5; i++){
				list.add(i);
			}
		}finally{
			System.out.println(thread.getName() + "释放了锁");
			lock.unlock();
		}
	}
}
