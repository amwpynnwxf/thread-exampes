package com.thread.samples.ticketSale;

/**
 * Ʊ��
 * @author wuyouwulv
 *
 */
public class Ticket {
	private Integer tickets = 20;
	
	private Ticket() {
		
	}

	private Object lock = "lock";
	
	/* �ǵ��������(�˴�Ϊ����Ķ�ʽ����)�������Ʊ�ֲ���ͬһ�������
    private static Ticket instance = null;
	
	public static Ticket getInstance(){
		if(null == instance){
			instance = new Ticket();
		}
		return instance;
	}*/
	
	private static Ticket instance = new Ticket();
	
	public  static Ticket getInstance(){
		return instance;
	}
	
	/**
	 * ��Ʊһ��
	 * @param stationName
	 */
	public void saleOne(String stationName){
		while(tickets >0){
			synchronized (lock) {// ͬ����ѭ�����棬��֤�����߳�����Ʊ
				if(tickets >0 ){
					System.out.println(String.format("%s�����˵�%s��Ʊ", stationName, tickets));
					tickets--;
					if(tickets <=0){
						System.out.println("Ʊ������");
					}
				}
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
