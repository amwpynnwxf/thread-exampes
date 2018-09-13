package com.thread.samples.callableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * callable:�첽ִ���̣߳�future:���𷵻��߳�ִ�н�����ṩ���������ܣ���1���ж������Ƿ���ɣ�2���ܹ��ж�����3���ܹ���ȡ����ִ�н��
 * @author wuyouwulv
 *
 */
public class CallableFutureTest {
	public static void main(String[] args) {
		MyCallable myCallable1 = new MyCallable(1000);
		MyCallable myCallable2 = new MyCallable(2000);

		FutureTask<String> futureTask1 = new FutureTask<String>(myCallable1);
		FutureTask<String> futureTask2 = new FutureTask<String>(myCallable2);

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(futureTask1);
		executor.execute(futureTask2);

		while (true) {
			try {
				if (futureTask1.isDone() && futureTask2.isDone()) {
					System.out.println("Done");
					executor.shutdown();
					return;
				}

				if (!futureTask1.isDone()) {
					System.out.println("future1 output=" + futureTask1.get());
				}
				
				System.out.println("Waiting for future2 to complete");
				String s = futureTask2.get(200, TimeUnit.MILLISECONDS);
				if(null != s){
					System.out.println("future2 output=" + s);
				}
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			} catch (TimeoutException o){
				System.out.println("timeout");
			}
		}
	}
}
