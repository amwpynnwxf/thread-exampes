package com.samples.design.adapte;

/**
 * 适配器模式：在不改变使用方接口调用的情况下，将实际调用变为已存在的另一接口功能；结构上它是一种包装模式
 * 实际场景中它是一种补偿模式，专用来在系统后期扩展、修改时所用
 * @author wuyouwulv
 *
 */
public class AdapteTest {

	public static void main(String[] args) {
		// 原来一些使用者都调用target的operation1接口
		Target target1 = new ConcreteTarget();
		target1.operation1();

		// 适配后，一些使用者依然调用的target的operation1接口，但是实际功能已经转换为adaptee的operation2
		Adaptee adaptee= new Adaptee();
		Adapter target2 = new Adapter();
		target2.setAdaptee(adaptee);
		target2.operation1();
	}

}
