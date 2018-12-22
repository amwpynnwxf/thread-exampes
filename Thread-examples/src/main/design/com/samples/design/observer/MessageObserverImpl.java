package com.samples.design.observer;

public class MessageObserverImpl implements MessageObserver {
	private String name;
	
	@Override
	public void receiveMessage(String message) {
		System.out.println("��" + name + "�����ܲ�������Ϣ>>>>>" + message);
	}

	public MessageObserverImpl(String name) {
		this.name = name;
	}

}
