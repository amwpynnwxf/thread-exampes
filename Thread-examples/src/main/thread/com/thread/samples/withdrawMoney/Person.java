package com.thread.samples.withdrawMoney;

import java.util.Random;

public class Person extends Thread {
	private Bank bank;
	private String lock = new String("X");
	
	public void setBank(Bank bank){
		this.bank = bank;
	}
	
	public Person(String name) {
		super(name);
	}

	@Override
	public void run() {
		Integer amount = new Random().nextInt(20);
		while(amount <= Bank.money){
			doWithdraw(amount);
			
			amount = new Random().nextInt(20);
		}
		
		if(amount > Bank.money){
			amount = Bank.money;
			doWithdraw(amount);
		}
	}
	
	//���Person����ͬһ��������ͬ�������ڸ�����κ�һ������Ч
	public  void doWithdraw(Integer amount){
		synchronized (lock) {
			bank.withdraw(amount);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
