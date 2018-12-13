package com.samples.design.factory.simple;

/**
 * 简单工厂模式：产品的一系列创造工作由工厂统一管理
 * 缺点：只对产品进行抽象，对于新增产品，需要修改工厂代码，不符合开闭原则
 * 优点：简单，虽然新增产品时需要修改工厂模式，但是当工厂的通用实现部分需要修改时，只需要修改工厂类，维护度小
 * @author wuyouwulv
 *
 */
public class FactorySimpleTest {

	public static void main(String[] args) {
		Car buick = new SimpleCarFactory().createCar("Buick");
		buick.run();
		Car audi = new SimpleCarFactory().createCar("Audi");
		audi.run();
	}

}
