package com.samples.design.singleton;

/**
 * 单例模式：内部类(利用内部类在首次访问才被加载的特性来实现)
 * 且内部类可以访问外部类private资源
 * @author wuyouwulv
 *
 */
public class InnerClassSingleton {
	private InnerClassSingleton(){

	}

	private static class InnerClassSingletonHolder{
		public static InnerClassSingleton instance = new InnerClassSingleton();
	}

	public static InnerClassSingleton getInstance(){
		return InnerClassSingletonHolder.instance;
	}

	public void doSomething(){
		System.out.println("InnerClass Singleton");
	}

	public static void main(String[] args){
		InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
		innerClassSingleton.doSomething();
	}
}
