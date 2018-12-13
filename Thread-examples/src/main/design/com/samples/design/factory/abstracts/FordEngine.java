package com.samples.design.factory.abstracts;

/**
 * 福特发动机
 * @author wuyouwulv
 *
 */
public class FordEngine implements Engine {

	@Override
	public void start() {
		System.out.println("福特发动机启动");
	}

	@Override
	public void run() {
		System.out.println("福特发动机开转...");
	}

}
