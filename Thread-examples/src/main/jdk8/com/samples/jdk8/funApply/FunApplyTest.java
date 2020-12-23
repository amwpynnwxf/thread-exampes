package com.samples.jdk8.funApply;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * ��������
 */
public class FunApplyTest {
	private String name;
	private int age;

	public FunApplyTest(String name, int age){
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// ʹ��˫ð��::�����쾲̬��������
	    Function<String, Integer> fun = Integer::parseInt;
	    Integer value = fun.apply("123");
	    System.out.println(value);

	    // ʹ��˫ð��::������Ǿ�̬��������
	    String content = "Hello JDK8";
	    Function<Integer, String> func = content::substring;
	    String result = func.apply(1);
	    System.out.println(result);

	    // ���캯������
	    BiFunction<String, Integer, FunApplyTest> biFunction = FunApplyTest::new;
	    FunApplyTest test = biFunction.apply("mengday", 28);
	    System.out.println(test.toString());

	    // ��������Ҳ��һ�ֺ���ʽ�ӿڣ�����Ҳ���Խ�����������Ϊ�����Ĳ���
	    sayHello(String::toUpperCase, "hello");
		}

	// ����������Ϊ����
	private static void sayHello(Function<String, String> func, String parameter){
	    String result = func.apply(parameter);
	    System.out.println(result);
	}

	@Override
	public String toString(){
		return "name: " + name + "; age: " + age;
	}
}
