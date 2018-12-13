package com.samples.design.factory.abstracts;


/**
 * 大众离合器
 * @author wuyouwulv
 *
 */
public class VwClutch implements Clutch {

	@Override
	public void work() {
		System.out.println("大众离合器工作...");
	}

}
