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
			System.out.println(">>���߳�" + Thread.currentThread().getName() + "��ʼִ������");
			try {
				Thread.sleep(new Random().nextInt(1000));
				System.out.println("--���߳�" + Thread.currentThread().getName() + "����ִ�����");
				
				cb.await();// �����ȴ��������߳�ִ�����
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("==�������߳���ϸ��ϣ����߳�" + Thread.currentThread().getName() + "ִ�к�������...");
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
