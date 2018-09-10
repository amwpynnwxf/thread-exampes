package com.thread.samples.ticketSale;

/**
 * 票仓
 * @author wuyouwulv
 *
 */
public class Ticket {
	private Integer tickets = 20;
	
	private Ticket() {
		
	}

	private Object lock = "lock";
	
	/* 非单例的情况(此处为错误的恶汉式单例)，会出现票仓不是同一个的情况
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
	 * 售票一张
	 * @param stationName
	 */
	public void saleOne(String stationName){
		while(tickets >0){
			synchronized (lock) {// 同步在循环里面，保证其他线程能售票
				if(tickets >0 ){
					System.out.println(String.format("%s卖出了第%s张票", stationName, tickets));
					tickets--;
					if(tickets <=0){
						System.out.println("票售完了");
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
