package com.samples.design.command;

/**
 * ����ģʽ���������װ�ɶ��󣬽����������ߺͶ���ִ���߽��ͨ�����Ӧ�пɳ����Ĳ�����
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
