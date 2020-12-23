package com.samples.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch：通常用在主线程启动若干子线程并发任务，主线程等待子线程任务完成继续执行主线程接下来的任务
 * @author wuyouwulv
 *
 */
public class CountDownLatchTest {
	
	static class LatchClass extends Thread{
		private int num;
		private final CountDownLatch countDownLatch;
		
		public LatchClass(int num, CountDownLatch countDownLatch) {
			this.num = num;
			this.countDownLatch = countDownLatch;
		}

		@Override
		public void run() {
			System.out.println("线程 " + num + ", 开始执行任务" + countDownLatch.getCount());
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			countDownLatch.countDown();// 子任务完成，多线程计数器-1
			System.out.println("线程 " + num + ", 任务执行完毕" + countDownLatch.getCount());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		int counts = 3;
		CountDownLatch latch = new CountDownLatch(counts);// 多线程计数器，计数值
		
		System.out.println("共 " + counts + "个子线程并行参与执行任务");
		for(int i=0; i<counts; i++){
			new LatchClass(i, latch).start();
			System.out.println(i);
		}
		
		System.out.println("等待所有子任务...");
		latch.await();// 阻塞，等待所有子线程完成任务
		
		Thread.sleep(5L);//IDE控制台输出并发无需问题
		System.out.println("=== 所有子线程均已完成任务，开始执行后续主任务 ===");
	}
}
