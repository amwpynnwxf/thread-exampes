package com.samples.design.command;

/**
 * ������Ž�ɫ���µ�������á��쳣�����������
 * @author wuyouwulv
 *
 */
public class DoOrderInvoker {
	private Command accDeductCommand;
	private Command stockReduceCommand;
	
	private final int price = 3;// ������Ʒ����=3
	
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
			//��¼�쳣ҵ����־
		}
	}
}
