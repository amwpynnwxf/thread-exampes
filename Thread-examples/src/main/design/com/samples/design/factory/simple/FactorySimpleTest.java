package com.samples.design.factory.simple;

/**
 * �򵥹���ģʽ����Ʒ��һϵ�д��칤���ɹ���ͳһ����
 * ȱ�㣺ֻ�Բ�Ʒ���г��󣬶���������Ʒ����Ҫ�޸Ĺ������룬�����Ͽ���ԭ��
 * �ŵ㣺�򵥣���Ȼ������Ʒʱ��Ҫ�޸Ĺ���ģʽ�����ǵ�������ͨ��ʵ�ֲ�����Ҫ�޸�ʱ��ֻ��Ҫ�޸Ĺ����࣬ά����С
 * @author wuyouwulv
 *
 */
public class FactorySimpleTest {

	public static void main(String[] args) {
		Car buick = new SimpleCarFactory().createCar("Buick");
		buick.run();
		Car audi = new SimpleCarFactory().createCar("Audi");
		audi.run();
	}

}
