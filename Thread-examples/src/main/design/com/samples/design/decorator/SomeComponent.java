package com.samples.design.decorator;

/**
 * �������
 * @author wuyouwulv
 *
 */
public class SomeComponent implements Component {

	@Override
	public void operation(String arg) {
		System.out.println("ԭʼ����: " + arg);
	}

}
