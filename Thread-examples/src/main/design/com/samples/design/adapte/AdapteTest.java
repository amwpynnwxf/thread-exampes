package com.samples.design.adapte;

/**
 * ������ģʽ���ڲ��ı�ʹ�÷��ӿڵ��õ�����£���ʵ�ʵ��ñ�Ϊ�Ѵ��ڵ���һ�ӿڹ��ܣ��ṹ������һ�ְ�װģʽ
 * ʵ�ʳ���������һ�ֲ���ģʽ��ר������ϵͳ������չ���޸�ʱ����
 * @author wuyouwulv
 *
 */
public class AdapteTest {

	public static void main(String[] args) {
		// ԭ��һЩʹ���߶�����target��operation1�ӿ�
		Target target1 = new ConcreteTarget();
		target1.operation1();

		// �����һЩʹ������Ȼ���õ�target��operation1�ӿڣ�����ʵ�ʹ����Ѿ�ת��Ϊadaptee��operation2
		Adaptee adaptee= new Adaptee();
		Adapter target2 = new Adapter();
		target2.setAdaptee(adaptee);
		target2.operation1();
	}

}
