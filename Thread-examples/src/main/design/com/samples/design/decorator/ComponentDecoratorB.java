package com.samples.design.decorator;

public class ComponentDecoratorB extends AbstractComponentDecorator {

	@Override
	public void operation(String arg) {
		System.out.println("before decorator B");
		super.operation(arg);
		System.out.println("after decorator B");
	}

	public ComponentDecoratorB(Component component) {
		super(component);
	}
	
}
