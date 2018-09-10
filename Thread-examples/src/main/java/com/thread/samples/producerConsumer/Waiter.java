package com.thread.samples.producerConsumer;

public class Waiter extends Thread {
	private KFC kfc;
	
	public Waiter(KFC kfc){
		this.kfc = kfc;
	}
	
	@Override
	public void run(){
		int amount = (int)(Math.random() * 5);
		while(true){
			kfc.produce(amount);
		}
	}
}
