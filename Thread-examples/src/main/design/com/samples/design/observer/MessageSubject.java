package com.samples.design.observer;

/**
 * �����ӿ�
 * @author wuyouwulv
 *
 */
public interface MessageSubject {
	void register(MessageObserver observer);
	void remove(MessageObserver observer);
	void notifyObserver(String message);
}
