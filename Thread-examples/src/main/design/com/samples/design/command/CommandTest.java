package com.samples.design.command;

/**
 * 命令模式：将请求封装成对象，将动作请求者和动作执行者解耦，通常会对应有可撤销的操作。
 * @author wuyouwulv
 *
 */
public class CommandTest {
	public static void main(String[] args){
		UserAccount userAccount = new UserAccount();
		GoodsStock goodsStock = new GoodsStock();
		
		DoOrderInvoker doOrderInvoker = new DoOrderInvoker(userAccount, goodsStock);
		doOrderInvoker.doOrder();
	}
}
