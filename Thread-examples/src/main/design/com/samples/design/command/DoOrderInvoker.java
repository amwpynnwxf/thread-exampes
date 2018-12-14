package com.samples.design.command;

/**
 * 命令编排角色：下单命令调用、异常撤销命令调用
 * @author wuyouwulv
 *
 */
public class DoOrderInvoker {
	private Command accDeductCommand;
	private Command stockReduceCommand;
	
	private final int price = 3;// 假设商品单价=3
	
	public DoOrderInvoker(UserAccount userAccount, GoodsStock goodsStock) {
		this.accDeductCommand = new AccountDeductCommand(userAccount);
		this.stockReduceCommand = new StockReduceCommand(goodsStock);
	}

	public void doOrder(){
		int num = (int) (Math.random() * 10);
		try{
			accDeductCommand.execute(num * price);
			stockReduceCommand.execute(num);
		}catch(Exception e){
			e.printStackTrace();
			this.doOrderException(num);
		}
	}
	
	public void doOrderException(int num){
		try{
			accDeductCommand.undo(num * price);
			stockReduceCommand.undo(num);
		}catch(Exception e){
			e.printStackTrace();
			//记录异常业务日志
		}
	}
}
