package com.samples.design.observer;

import java.util.ArrayList;
import java.util.List;

public class MessageSubjectImpl implements MessageSubject {
	private List<MessageObserver> observerList;
	
	@Override
	public void register(MessageObserver observer) {
		if(null == observerList){
			observerList = new ArrayList<MessageObserver>();
		}
		
		observerList.add(observer);
	}

	@Override
	public void remove(MessageObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObserver(String message) {
		for(int i=0; i < observerList.size(); i++){
			observerList.get(i).receiveMessage(message);
		}
	}

}
