package com.samples.design.factory.method;

/**
 * ��������ģʽ���Թ����Ͳ�Ʒ�������˳���
 * �ŵ㣺����һ����Ʒ��ֻ��Ҫ��Ӷ�Ӧ�Ĺ������У�����Ҫ�޸Ĺ������룬���ϡ���-�ա�ԭ��
 * ȱ�㣺��Ʒ�ܶ�ʱ������Ҳ���������Ӻܶ࣬���Ҫ�޸Ĺ�����һЩ����ʵ���߼���ά�����Ƚϴ�
 * @author wuyouwulv
 *
 */
public class FactoryMethodTest {
	public static void main(String[] args){
		Car bmw = new BmwFactory().createCar();
		bmw.run();
		
		Car porsche = new PorscheFactory().createCar();
		porsche.run();
	}
}
