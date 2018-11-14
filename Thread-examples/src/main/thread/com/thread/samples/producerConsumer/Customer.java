package com.thread.samples.producerConsumer;

public class Customer extends Thread {
	private KFC kfc;
	
	public Customer(KFC kfc){
		this.kfc = kfc;
	}

	@Override
	public void run() {
		int amount = (int)(Math.random() * 5);
		while(true){
			kfc.consume(amount);
		}
	}
}
