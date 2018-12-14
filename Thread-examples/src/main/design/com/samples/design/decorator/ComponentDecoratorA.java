package com.samples.design.decorator;

public class ComponentDecoratorA extends AbstractComponentDecorator {

	@Override
	public void operation(String arg) {
		System.out.println("before decorator A");//装饰操作
		super.operation(arg);//调用被装饰原有的操作
		System.out.println("after decorator A");//装饰操作
	}

	/**
	 * 同抽象类的构造
	 * @param component
	 */
	public ComponentDecoratorA(Component component) {
		super(component);
	}
	
}
