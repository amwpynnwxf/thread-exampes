package com.samples.design.template;

/**
 * ģ�巽��ģʽ���ݲ�ʾ��
 * ��������ģ�巽���ж����ҵ���߼�˳�򣬲���Ҳ��������ṩһЩĬ��ʵ��
 * @author wuyouwulv
 *
 */
public class TemplateMethodTest {

	public static void main(String[] args) {
		MakeGreenTea makeGreenTea = new MakeGreenTea();
		makeGreenTea.makeTea();

		MakeBlackTea makeBlackTea = new MakeBlackTea();
		makeBlackTea.makeTea();
	}

}
