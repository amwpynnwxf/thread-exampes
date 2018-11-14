package com.thread.samples.withdrawMoney;

/**
 * 取钱示例，多线程对共享数据随机减
 * 需要分辨出多线程逻辑中的“公共区”，如下面两种调用，公共区的位置不同
 * @author wuyouwulv
 *
 */
public class DrawMoneyTest {

	public static void main(String[] args){
		Bank bank = new Bank();
		
		// 如果下面两个例子，所有操作都在bank中，则效果是一样的
		/** 线程中的person对象不同，需要对bank进行加锁，并且逻辑判断也要放到bank去处理 */
		/*Person personA = new Person("A");
		Person personB = new Person("B");
		personA.setBank(bank);
		personB.setBank(bank);
		
		personA.start();
		personB.start();*/
		
		/** 线程中的person 相同， 可以对person中的操作区域加锁 */
		Person person = new Person("A");
		person.setBank(bank);
		Thread t1 = new Thread(person);
		Thread t2 = new Thread(person);
		
		t1.start();
		t2.start();
	}
}
