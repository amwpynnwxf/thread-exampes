package com.samples.design.facade;

/**
 * ���ģʽ(����ģʽ)����һЩ�ڲ����ܽ��з�װ�������ṩ�ɷ��ʽӿ�(�ⲿ�ܷ��ʵ���ֻ�����)������ϵͳ���ڲ�ʵ��
 * @author wuyouwulv
 *
 */
public class FacadeTest {

	public static void main(String[] args) {
		ComputeFacade compute = new ComputeFacade();
		compute.start();
		System.out.println("<<.>>");
		compute.shutdown();
	}

}
