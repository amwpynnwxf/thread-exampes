package com.thread.samples.withdrawMoney;

public class Bank {
	public static Integer money=100;// ��̬���ߵ���
	
	// ͬ����ֻ�м��ڡ�������(����������Ĺ���������)�ĵط�����������
	public void withdraw(Integer amount){
		Bank.money = Bank.money - amount;
		System.out.println(Thread.currentThread().getName() + "ȡ����" + amount + "��ʣ��" + Bank.money);
	}
}
