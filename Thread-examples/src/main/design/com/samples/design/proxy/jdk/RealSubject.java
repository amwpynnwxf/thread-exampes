package com.samples.design.proxy.jdk;

public class RealSubject {
	public void hello(String str){
		System.out.println("hello: " + str);
	}
	
	public void bye(){
		System.out.println("bye!");
	}
}
