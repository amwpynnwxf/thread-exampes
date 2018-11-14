package com.thread.samples.accessMoney;

public class Children extends Thread {
	private Bank bank;
	
	public Children(Bank bank){
		this.bank = bank;
	}
	
	@Override
	public void run(){
		while(true){
			bank.withdrawMoney(100);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
