package com.samples.jdk8.funApply;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 方法引用
 */
public class FunApplyTest {
	private String name;
	private int age;

	public FunApplyTest(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// 使用双冒号::来构造静态函数引用
	    Function<String, Integer> fun = Integer::parseInt;
	    Integer value = fun.apply("123");
	    System.out.println(value);

	    // 使用双冒号::来构造非静态函数引用
	    String content = "Hello JDK8";
	    Function<Integer, String> func = content::substring;
	    String result = func.apply(1);
	    System.out.println(result);

	    // 构造函数引用
	    BiFunction<String, Integer, FunApplyTest> biFunction = FunApplyTest::new;
	    FunApplyTest test = biFunction.apply("mengday", 28);
	    System.out.println(test.toString());

	    // 函数引用也是一种函数式接口，所以也可以将函数引用作为方法的参数
	    sayHello(String::toUpperCase, "hello");
		}

	// 方法引用作为参数
	private static void sayHello(Function<String, String> func, String parameter){
	    String result = func.apply(parameter);
	    System.out.println(result);
	}

	@Override
	public String toString(){
		return "name: " + name + "; age: " + age;
	}
}
