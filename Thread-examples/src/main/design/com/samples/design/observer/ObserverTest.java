package com.samples.design.observer;

/**
 * 观察者模式: 也可理解为发布订阅模式
 * 相应的：subject(主题) = Publisher(发布者)； observer(观察者) = listener(监听/订阅)
 * 发布者和订阅者为一对多
 * @author wuyouwulv
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		MessageSubject messageSubject = new MessageSubjectImpl();
		
		MessageObserver sms = new MessageObserverImpl("短信");
		messageSubject.register(sms);
		MessageObserver email = new MessageObserverImpl("email");
		messageSubject.register(email);
		MessageObserver push = new MessageObserverImpl("push");
		messageSubject.register(push);
		
		messageSubject.notifyObserver("abc123水水水水是是是是是是");
	}

}
