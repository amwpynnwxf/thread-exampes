package com.thread.samples.accessMoney;

/**
 * 孩子取钱(每次取100，钱不够通知妈妈存钱)，妈妈存钱(每次存2000，存完里面通知孩子取钱)
 * 对线程等待的条件的判断要使用while而不是if来进行判断。这样在线程被唤醒后，会再次判断条件是否正真满足
 * @author wuyouwulv
 *
 */
public class AccessMoneyTest {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Mother mother = new Mother(bank);
		Children c1 = new Children(bank);
		Children c2 = new Children(bank);
		Children c3 = new Children(bank);
		c1.setName("c1");
		c2.setName("c2");
		c3.setName("c3");
		
		mother.start();
		c1.start();
		c2.start();
		c3.start();
	}

}
