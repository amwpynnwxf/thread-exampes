package com.samples.design.template;

/**
 * 模板方法模式：泡茶示例
 * 抽象基类的模板方法中定义好业务逻辑顺序，并且也根据情况提供一些默认实现
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
