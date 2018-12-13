package com.samples.design.factory.method;

/**
 * 工厂方法模式：对工厂和产品都进行了抽象
 * 优点：新增一个产品，只需要添加对应的工厂就行，不需要修改工厂代码，符合“开-闭”原则
 * 缺点：产品很多时，工厂也会随着增加很多，如果要修改工厂的一些公用实现逻辑，维护量比较大
 * @author wuyouwulv
 *
 */
public class FactoryMethodTest {
	public static void main(String[] args){
		Car bmw = new BmwFactory().createCar();
		bmw.run();
		
		Car porsche = new PorscheFactory().createCar();
		porsche.run();
	}
}
