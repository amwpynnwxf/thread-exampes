package com.thread.samples.ticketSale;

/**
 * ���̶߳�ͬһ����������ݼ�
 * @author wuyouwulv
 *
 */
public class TicketSaleTest {
	public static void main(String[] args){
		Station station1 = new Station("����1");
		Station station2 = new Station("����2");
		Station station3 = new Station("����3");
		
		// ��������ͬʱ��Ʊ
		station1.start();
		station2.start();
		station3.start();
	}
}
