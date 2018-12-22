package com.samples.design.state;

/**
 * ״̬ģʽ����״̬Ϊԭ��(״̬��)���ı�������Ϊ��������ͨ����Ϊ���ı�״̬
 * ע��Ͳ���ģʽ���������ǵ���ͼ���񣬶��ǻ����������ģʽ�࣬Ȼ����þ����ģʽ�෽��
 * ���ǵı����������ڻ������ʵ�������÷�ʽ�ϣ�����ģʽ�ص����ڶԲ�����һѡ��ִ�У�״̬ģʽ���ص���ִ��ĳ��״̬��ĳ����Ϊ����������ʵ������Ϊ���Ƕ����
 * @author wuyouwulv
 *
 */
public class StateTest {

	public static void main(String[] args) {
		System.out.println("�ͷ�1��");
		Room room = new Room();
		room.booking();
		room.checkin();
		room.checkout();
		System.out.println(room);
		
		System.out.println("\r\n�ͷ�2��");
		Room room2 = new Room();
		room2.setState(new CheckinState(room2));
		room2.booking();
		room2.checkin();
		System.out.println(room2);
	}

}
