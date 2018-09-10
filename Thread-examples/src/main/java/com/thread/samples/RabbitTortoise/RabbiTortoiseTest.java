package com.thread.samples.RabbitTortoise;

/**
 * ��������ʾ�����߳���ֹ����(�߳���ֹ��һ���߳�)
 * ��stop��ֹ�߳�̫����������ǿ����ֹ���ڽ��е��̣߳������ǲ���ȫ��
 * ��������Ӧ����һ������ȥ��ҵ����������ֹ�߳�
 * @author wuyouwulv
 *
 */
public class RabbiTortoiseTest {

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		Tortoise tortoise = new Tortoise();
		LetOneStop rabbitCallBack = new LetOneStop(tortoise);
		LetOneStop tortoiseCallBack = new LetOneStop(rabbit);
		rabbit.callToBack = rabbitCallBack;
		tortoise.callToBack = tortoiseCallBack;
		
		tortoise.start();
		rabbit.start();
	}

}
