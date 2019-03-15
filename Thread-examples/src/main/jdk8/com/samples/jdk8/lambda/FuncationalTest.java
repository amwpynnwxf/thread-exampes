package com.samples.jdk8.lambda;

/**
 * 函数式编程：函数式接口+lambda
 * @author wuyouwulv
 *
 */
public class FuncationalTest {
	public static void main(String[] args) {
		IntHandler hd1 = (num1, num2) ->{return num1 + num2;};
		int r1 = hd1.handle(123, 666);
		System.out.println(r1);// 789
		
		IntHandler hd2 = (num1, num2) ->{return Integer.max(num1, num2);};
		int r2 = hd2.handle(123, 666);
		System.out.println(r2);// 666
	}

}
