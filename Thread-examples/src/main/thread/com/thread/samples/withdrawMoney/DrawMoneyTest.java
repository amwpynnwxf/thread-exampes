package com.thread.samples.withdrawMoney;

/**
 * ȡǮʾ�������̶߳Թ������������
 * ��Ҫ�ֱ�����߳��߼��еġ��������������������ֵ��ã���������λ�ò�ͬ
 * @author wuyouwulv
 *
 */
public class DrawMoneyTest {

	public static void main(String[] args){
		Bank bank = new Bank();
		
		// ��������������ӣ����в�������bank�У���Ч����һ����
		/** �߳��е�person����ͬ����Ҫ��bank���м����������߼��ж�ҲҪ�ŵ�bankȥ���� */
		/*Person personA = new Person("A");
		Person personB = new Person("B");
		personA.setBank(bank);
		personB.setBank(bank);
		
		personA.start();
		personB.start();*/
		
		/** �߳��е�person ��ͬ�� ���Զ�person�еĲ���������� */
		Person person = new Person("A");
		person.setBank(bank);
		Thread t1 = new Thread(person);
		Thread t2 = new Thread(person);
		
		t1.start();
		t2.start();
	}
}
