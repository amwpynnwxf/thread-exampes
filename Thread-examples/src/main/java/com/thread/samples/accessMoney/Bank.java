package com.thread.samples.accessMoney;

public class Bank {
	private static int money = 0;
	
	public void saveMoney(){
		synchronized(this){
			while(money - 100 <= 0){// ��wait�������жϲ�Ҫ��if��Ӧ����while�����̱߳����Ѻ�����ִ���ж�
				money += 2000;
				System.out.println("��Ǯ2000���˻����" + money);
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
			System.out.println(Thread.currentThread().getName() + "ȡǮ" + amount + "���˻����" + money);
		}
	}
}
