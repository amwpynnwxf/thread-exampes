package com.samples.jdk8.defaultUse;

public interface SomeInterface {
	default void op1(String s) {
		System.out.println("default: " + s);
	}
	
	void op2(String str);
}
