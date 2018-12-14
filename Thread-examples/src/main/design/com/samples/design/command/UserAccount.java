package com.samples.design.command;


/**
 * 命令接受(执行)方：用户账户信息
 * @author wuyouwulv
 *
 */
public class UserAccount {
	private static long accAmount = 100;
	/**
	 * 扣款
	 */
	public void doDeduct(long amount){
		accAmount -= amount;
		if(0 > accAmount){
			throw new RuntimeException("账户余额不够，扣款：" + amount + ",余额：" + accAmount);
		}
	}
	
	/**
	 * 退款
	 */
	public void doRefund(long amount){
		accAmount += amount;
	}
}
