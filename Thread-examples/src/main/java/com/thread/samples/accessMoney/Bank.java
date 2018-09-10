package com.thread.samples.accessMoney;

public class Bank {
	private static int money = 0;
	
	public void saveMoney(){
		synchronized(this){
			while(money - 100 <= 0){// 有wait的条件判断不要用if而应该用while，等线程被唤醒后重新执行判断
				money += 2000;
				System.out.println("存钱2000后账户余额" + money);
				notifyAll();
				
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public void withdrawMoney(int amount){
		synchronized (this) {
			while(money - amount < 0){
				notifyAll();
				
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			money -= amount;
			System.out.println(Thread.currentThread().getName() + "取钱" + amount + "后账户余额" + money);
		}
	}
}
