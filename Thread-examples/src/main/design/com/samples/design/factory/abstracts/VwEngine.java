package com.samples.design.factory.abstracts;

/**
 * 大众汽车发动机
 * @author wuyouwulv
 *
 */
public class VwEngine implements Engine {

	@Override
	public void start() {
		System.out.println("大众发动机启动");
	}

	@Override
	public void run() {
		System.out.println("大众发动机开转...");
	}

}
