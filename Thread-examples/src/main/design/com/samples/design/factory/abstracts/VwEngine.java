package com.samples.design.factory.abstracts;

/**
 * ��������������
 * @author wuyouwulv
 *
 */
public class VwEngine implements Engine {

	@Override
	public void start() {
		System.out.println("���ڷ���������");
	}

	@Override
	public void run() {
		System.out.println("���ڷ�������ת...");
	}

}
