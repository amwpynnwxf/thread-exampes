package com.samples.design.command;


/**
 * �������(ִ��)�����û��˻���Ϣ
 * @author wuyouwulv
 *
 */
public class UserAccount {
	private static long accAmount = 100;
	/**
	 * �ۿ�
	 */
	public void doDeduct(long amount){
		accAmount -= amount;
		if(0 > accAmount){
			throw new RuntimeException("�˻��������ۿ" + amount + ",��" + accAmount);
		}
	}
	
	/**
	 * �˿�
	 */
	public void doRefund(long amount){
		accAmount += amount;
	}
}
