package com.samples.design.command;

/**
 * ����������ۼ�
 * @author wuyouwulv
 *
 */
public class StockReduceCommand implements Command {
	private GoodsStock goodsStock;
	
	public StockReduceCommand(GoodsStock goodsStock) {
		this.goodsStock = goodsStock;
	}

	@Override
	public void execute(int num) {
		goodsStock.doReduce(num);
	}

	@Override
	public void undo(int num) {
		goodsStock.doIncrease(num);
	}

}
