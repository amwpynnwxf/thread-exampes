package com.samples.design.factory.method;

public class PorscheFactory implements CarFactory {

	@Override
	public Car createCar() {
		// 一些创建前的操作
		return new Porsche();
	}

}
