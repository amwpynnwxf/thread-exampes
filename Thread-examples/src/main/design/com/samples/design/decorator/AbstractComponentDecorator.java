package com.samples.design.decorator;

/**
 * 装饰器的抽象
 * @author wuyouwulv
 *
 */
public class AbstractComponentDecorator implements Component {
	// 持有被装饰组件的实例
	private Component component;
	// 组件的构造函数
	public AbstractComponentDecorator(Component component) {
		this.component = component;
	}
	@Override
	public void operation(String arg) {
		component.operation(arg);//调用被装饰组件的方法
	}
	
	public AbstractComponentDecorator() {
		super();
	}

}
