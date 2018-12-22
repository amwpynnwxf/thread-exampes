package com.samples.design.decorator;

public class ComponentDecoratorA extends AbstractComponentDecorator {

	@Override
	public void operation(String arg) {
		System.out.println("before decorator A");//װ�β���
		super.operation(arg);//���ñ�װ��ԭ�еĲ���
		System.out.println("after decorator A");//װ�β���
	}

	/**
	 * ͬ������Ĺ���
	 * @param component
	 */
	public ComponentDecoratorA(Component component) {
		super(component);
	}
	
}
