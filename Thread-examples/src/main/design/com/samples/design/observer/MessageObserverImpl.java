package com.samples.design.observer;

public class MessageObserverImpl implements MessageObserver {
	private String name;
	
	@Override
	public void receiveMessage(String message) {
		System.out.println("【" + name + "】接受并处理信息>>>>>" + message);
	}

	public MessageObserverImpl(String name) {
		this.name = name;
	}

}
