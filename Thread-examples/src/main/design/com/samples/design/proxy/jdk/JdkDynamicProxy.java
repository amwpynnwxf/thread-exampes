package com.samples.design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		
		InvocationHandler handler = new DynamicProxy(realSubject);
		
		Subject realSubjectProxy = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
		
		realSubjectProxy.hello("aaa");
		realSubjectProxy.bye();
	}

}
