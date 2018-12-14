package com.samples.design.decorator;

/**
 * 装饰器模式
 * 装饰器要和被装饰的组件属于同一种类(可以是接口、抽象类或者类看实际情况)
 * 装饰器持有一个组件的对象实例，还有一个带该组件参数的构造函数用于层层包装
 * 具体装饰器同样需要这个构造函数，重写要装饰的方法（装饰操作、调用被装饰该方法）
 * 最重要的是具体组件和具体装饰，具体类如果只有一个，那么就可以不用抽象
 * @author wuyouwulv
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Component someComponent = new SomeComponent();
		
		Component targComponent = new ComponentDecoratorA(new ComponentDecoratorB(someComponent));
		targComponent.operation("11111111");
	}

}
