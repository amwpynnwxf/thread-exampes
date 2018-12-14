package com.samples.design.adapte;

/**
 * ������������������
 * ��adapter�̳�adaptee�ͱ������������
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
