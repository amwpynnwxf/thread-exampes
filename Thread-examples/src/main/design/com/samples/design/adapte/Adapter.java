package com.samples.design.adapte;

/**
 * 适配器：对象适配器
 * 把adapter继承adaptee就变成了类适配器
 * @author wuyouwulv
 *
 */
public class Adapter implements Target {
	private Adaptee adaptee;
	
	@Override
	public void operation1() {
		adaptee.operation2();
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

}
