package com.samples.design.adapte;

public class ConcreteTarget implements Target {

	@Override
	public void operation1() {
		System.out.println("执行目标接口中的原有业务");
	}

}
