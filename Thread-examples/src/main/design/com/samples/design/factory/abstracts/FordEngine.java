package com.samples.design.factory.abstracts;

/**
 * ���ط�����
 * @author wuyouwulv
 *
 */
public class FordEngine implements Engine {

	@Override
	public void start() {
		System.out.println("���ط���������");
	}

	@Override
	public void run() {
		System.out.println("���ط�������ת...");
	}

}
