package com.samples.design.factory.method;

public class PorscheFactory implements CarFactory {

	@Override
	public Car createCar() {
		// һЩ����ǰ�Ĳ���
		return new Porsche();
	}

}
