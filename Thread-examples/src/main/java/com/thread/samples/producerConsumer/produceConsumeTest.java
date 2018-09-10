package com.thread.samples.producerConsumer;

/**
 * ����-����ģ��ʾ��
 * synchronized (this)�����ã�����������һ������������Ŷ�
 * ���̵߳ȴ����������ж�Ҫʹ��while������if�������жϡ��������̱߳����Ѻ󣬻��ٴ��ж������Ƿ���������
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
