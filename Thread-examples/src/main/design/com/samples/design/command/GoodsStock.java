package com.samples.design.command;

/**
 * �������(ִ��)������Ʒ�����Ϣ
 * @author wuyouwulv
 *
 */
public class GoodsStock {
	private static int stockNum = 50;
	
	/**
	 * ���۳�
	 */
	public void doReduce(int num){
		stockNum -= num;
		if(0 > stockNum){
			throw new RuntimeException("��Ʒ��治�㣬�����棺" + num + ", ʣ���棺" + stockNum);
		}
	}
	
	/**
	 * �������
	 */
	public void doIncrease(int num){
		stockNum += num;
	}
}
