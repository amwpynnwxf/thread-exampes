package com.thread.samples.lock.reentrantLock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * tryLock 尝试获得锁，拿不到继续往下执行
 * @author wuyouwulv
 *
 */
public class TryLockTest {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	Lock lock = new ReentrantLock();
	
	public static void main(String[] args){
		TryLockTest test = new TryLockTest();
		new Thread(){
			public void run(){
				test.insert(Thread.currentThread());
			}
		}.start();
		
		new Thread(){
			public void run(){
				test.insert(Thread.currentThread());
			}
		}.start();
	}
	
	private void insert(Thread thread){
		if(lock.tryLock()){
		//if(lock.tryLock(100, TimeUnit.MILLISECONDS)){	// 区别在于拿不到锁时会等待一定的时间，在时间期限之内如果还拿不到锁，就返回false
			try{
				System.out.println(thread.getName() + "得到了锁");
				for(int i=0; i<5; i++){
					list.add(i);
				}
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				System.out.println(thread.getName() + "释放了锁");
				lock.unlock();
			}
		}else{
			System.out.println(thread.getName() + "未获得锁");
		}
		
	}
}
