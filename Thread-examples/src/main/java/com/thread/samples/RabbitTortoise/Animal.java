package com.thread.samples.RabbitTortoise;

public abstract class Animal extends Thread {
	public double length = 10; // ��������
	public boolean stopMe = false; // �����߳���ֹ
	
	public abstract void running(); // ���ܳ��󷽷�

	@Override
	public void run() {
		while(!stopMe && length > 0){
			running();
		}
	}
	
	/*��������ִ��win�ص����ڲ��ӿں�ʵ��
	    ���ӿڶ������ڲ���ʵ�����ֶ������ⲿ, �Ƿ�ͳһȫ��Ϊ�ڲ����ȫ���ⲿ��Ϊ����)*/
	public static interface CallToBack{
		public void win();
	}
	
	public CallToBack callToBack;
}
