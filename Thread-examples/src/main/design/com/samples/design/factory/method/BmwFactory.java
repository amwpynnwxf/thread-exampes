package com.samples.design.factory.method;


public class BmwFactory implements CarFactory {

	@Override
	public Car createCar() {
		// һЩ����ǰ�Ĳ���
		return new Bmw();
	}

}
