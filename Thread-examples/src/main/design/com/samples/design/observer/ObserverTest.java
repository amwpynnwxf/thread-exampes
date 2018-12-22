package com.samples.design.observer;

/**
 * �۲���ģʽ: Ҳ�����Ϊ��������ģʽ
 * ��Ӧ�ģ�subject(����) = Publisher(������)�� observer(�۲���) = listener(����/����)
 * �����ߺͶ�����Ϊһ�Զ�
 * @author wuyouwulv
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		MessageSubject messageSubject = new MessageSubjectImpl();
		
		MessageObserver sms = new MessageObserverImpl("����");
		messageSubject.register(sms);
		MessageObserver email = new MessageObserverImpl("email");
		messageSubject.register(email);
		MessageObserver push = new MessageObserverImpl("push");
		messageSubject.register(push);
		
		messageSubject.notifyObserver("abc123ˮˮˮˮ������������");
	}

}
