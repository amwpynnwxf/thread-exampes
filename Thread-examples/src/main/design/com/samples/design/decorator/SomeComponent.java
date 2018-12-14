package com.samples.design.decorator;

/**
 * 具体组件
 * @author wuyouwulv
 *
 */
public class SomeComponent implements Component {

	@Override
	public void operation(String arg) {
		System.out.println("原始操作: " + arg);
	}

}
