package com.thread.samples.ticketSale;

/**
 * 售票窗口
 * @author wuyouwulv
 *
 */
public class Station extends Thread{

	public Station(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		// 从票仓中售票一张
		Ticket.getInstance().saleOne(getName());
	}
}
