package com.samples.jdk8.defaultUse;

public class DefaultTest {

	public static void main(String[] args) {
		SomeInterface si = new SomeInterfaceImpl();
		si.op1("sss");
		si.op2("vv");
	}

}
