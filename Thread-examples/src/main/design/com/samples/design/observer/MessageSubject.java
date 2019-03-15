package com.samples.design.observer;

/**
 * 发布接口
 * @author wuyouwulv
 *
 */
public interface MessageSubject {
	void register(MessageObserver observer);
	void remove(MessageObserver observer);
	void notifyObserver(String message);
}
