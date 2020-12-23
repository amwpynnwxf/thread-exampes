package com.samples.concurrent.countdownlatch;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	static class SubTask extends Thread{
		CyclicBarrier cb;
		
		SubTask(CyclicBarrier cb){
			this.cb = cb;
		}

		@Override
		public void run() {
			System.out.println(">>子线程" + Thread.currentThread().getName() + "开始执行任务");
			try {
				Thread.sleep(new Random().nextInt(1000));
				System.out.println("--子线程" + Thread.currentThread().getName() + "任务执行完毕");
				
				cb.await();// 阻塞等待其他子线程执行完毕
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("==所有子线程仔细完毕，子线程" + Thread.currentThread().getName() + "执行后续任务...");
		}
		
	}
	
	public static void main(String[] args) {
		int num = 3;
		CyclicBarrier cb = new CyclicBarrier(num);
		for(int i=0; i<3; i++){
			new SubTask(cb).start();
		}
	}

}
