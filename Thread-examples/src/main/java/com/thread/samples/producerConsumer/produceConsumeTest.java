package com.thread.samples.producerConsumer;

/**
 * 生产-消费模型示例
 * synchronized (this)的运用，多个代码块用一个锁对象进行排队
 * 对线程等待的条件的判断要使用while而不是if来进行判断。这样在线程被唤醒后，会再次判断条件是否正真满足
 * @author wuyouwulv
 *
 */
public class produceConsumeTest {
	public static void main(String[] args){
		KFC kfc = new KFC();
		
		Customer consumer1 = new Customer(kfc);
		Customer consumer2 = new Customer(kfc);
		Customer consumer3 = new Customer(kfc);
		Customer consumer4 = new Customer(kfc);
		
		Waiter waiter1 = new Waiter(kfc);
		Waiter waiter2 = new Waiter(kfc);
		Waiter waiter3 = new Waiter(kfc);
		
		waiter1.start();
		waiter2.start();
		waiter3.start();
		consumer1.start();
		consumer2.start();
		consumer3.start();
		consumer4.start();
	}
}
