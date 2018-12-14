package com.samples.design.observer;

public interface MessageSubject {
	void register(MessageObserver observer);
	void remove(MessageObserver observer);
	void notifyObserver(String message);
}
