package com.samples.design.command;

/**
 * 命令接受(执行)方：商品库存信息
 * @author wuyouwulv
 *
 */
public class GoodsStock {
	private static int stockNum = 50;
	
	/**
	 * 库存扣除
	 */
	public void doReduce(int num){
		stockNum -= num;
		if(0 > stockNum){
			throw new RuntimeException("商品库存不足，需减库存：" + num + ", 剩余库存：" + stockNum);
		}
	}
	
	/**
	 * 库存增加
	 */
	public void doIncrease(int num){
		stockNum += num;
	}
}
