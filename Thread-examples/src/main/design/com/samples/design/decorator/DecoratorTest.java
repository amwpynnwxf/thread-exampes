package com.samples.design.decorator;

/**
 * װ����ģʽ
 * װ����Ҫ�ͱ�װ�ε��������ͬһ����(�����ǽӿڡ�����������࿴ʵ�����)
 * װ��������һ������Ķ���ʵ��������һ��������������Ĺ��캯�����ڲ���װ
 * ����װ����ͬ����Ҫ������캯������дҪװ�εķ�����װ�β��������ñ�װ�θ÷�����
 * ����Ҫ���Ǿ�������;���װ�Σ����������ֻ��һ������ô�Ϳ��Բ��ó���
 * @author wuyouwulv
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Component someComponent = new SomeComponent();
		
		Component targComponent = new ComponentDecoratorA(new ComponentDecoratorB(someComponent));
		targComponent.operation("11111111");
	}

}
