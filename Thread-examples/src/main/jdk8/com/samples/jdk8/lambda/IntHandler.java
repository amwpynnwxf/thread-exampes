package com.samples.jdk8.lambda;

/**
 * 函数式接口
 * @author wuyouwulv
 *
 */
@FunctionalInterface
public interface IntHandler {
	int handle(int num1, int num2);
}
