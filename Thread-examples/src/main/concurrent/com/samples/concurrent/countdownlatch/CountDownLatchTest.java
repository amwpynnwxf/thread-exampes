package com.samples.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch��ͨ���������߳������������̲߳����������̵߳ȴ����߳�������ɼ���ִ�����߳̽�����������
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
			System.out.println("�߳� " + num + ", ��ʼִ������" + countDownLatch.getCount());
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			countDownLatch.countDown();// ��������ɣ����̼߳�����-1
			System.out.println("�߳� " + num + ", ����ִ�����" + countDownLatch.getCount());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		int counts = 3;
		CountDownLatch latch = new CountDownLatch(counts);// ���̼߳�����������ֵ
		
		System.out.println("�� " + counts + "�����̲߳��в���ִ������");
		for(int i=0; i<counts; i++){
			new LatchClass(i, latch).start();
			System.out.println(i);
		}
		
		System.out.println("�ȴ�����������...");
		latch.await();// �������ȴ��������߳��������
		
		Thread.sleep(5L);//IDE����̨���������������
		System.out.println("=== �������߳̾���������񣬿�ʼִ�к��������� ===");
	}
}
