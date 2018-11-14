package com.thread.samples.lock.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronized无法被中断
 * 对于synchronized来说，如果一个线程在等待锁，那么结果只有两种，要么它获得这把锁继续执行，要么它就保存等待，即使调用中断线程的方法，也不会生效。
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
			System.out.println(thread.getName() + "进入同步块");
			while(true){//Never releases lock, 当前线程无限循环出让执行权-获得执行权
				Thread.yield();// 让出执行权，让自己或者其它的线程继续争夺执行权
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
				System.out.println("中断线程!!");
                break;
			}else{
				test.insert(Thread.currentThread());
			}
		}
	}
	
}