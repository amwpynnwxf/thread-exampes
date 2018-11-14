package com.thread.samples.withdrawMoney;

public class Bank {
	public static Integer money=100;// 静态或者单例
	
	// 同步锁只有加在“公共”(即公共对象的公共“区域”)的地方才能起到作用
	public void withdraw(Integer amount){
		Bank.money = Bank.money - amount;
		System.out.println(Thread.currentThread().getName() + "取走了" + amount + "还剩下" + Bank.money);
	}
}
