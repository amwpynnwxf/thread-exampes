package com.thread.samples.ticketSale;

/**
 * ��Ʊ����
 * @author wuyouwulv
 *
 */
public class Station extends Thread{

	public Station(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		// ��Ʊ������Ʊһ��
		Ticket.getInstance().saleOne(getName());
	}
}
