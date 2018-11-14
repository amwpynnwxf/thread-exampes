package com.thread.samples.accessMoney;

public class Mother extends Thread {
	private Bank bank;
	
	public Mother(Bank bank){
		this.bank = bank;
	}
	
	@Override
	public void run(){
		while(true){
			bank.saveMoney();
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
