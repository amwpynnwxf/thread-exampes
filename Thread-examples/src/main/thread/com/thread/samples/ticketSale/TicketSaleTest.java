package com.thread.samples.ticketSale;

/**
 * 多线程对同一个共享变量递减
 * @author wuyouwulv
 *
 */
public class TicketSaleTest {
	public static void main(String[] args){
		Station station1 = new Station("窗口1");
		Station station2 = new Station("窗口2");
		Station station3 = new Station("窗口3");
		
		// 三个窗口同时售票
		station1.start();
		station2.start();
		station3.start();
	}
}
