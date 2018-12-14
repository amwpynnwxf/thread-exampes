package com.samples.design.state;

/**
 * 状态模式：以状态为原子(状态类)来改变它的行为，而不是通过行为来改变状态
 * 注意和策略模式的区别，它们的类图很像，都是环境类组合了模式类，然后调用具体的模式类方法
 * 它们的本质区别在于环境类对实例的运用方式上，策略模式重点在于对策略折一选择执行，状态模式侧重点是执行某个状态的某个行为，往往它的实例和行为都是多个的
 * @author wuyouwulv
 *
 */
public class StateTest {

	public static void main(String[] args) {
		System.out.println("客房1：");
		Room room = new Room();
		room.booking();
		room.checkin();
		room.checkout();
		System.out.println(room);
		
		System.out.println("\r\n客房2：");
		Room room2 = new Room();
		room2.setState(new CheckinState(room2));
		room2.booking();
		room2.checkin();
		System.out.println(room2);
	}

}
