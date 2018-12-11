package com.samples.design.singleton;

/**
 * 单例模式：懒汉模式[非线程安全]
 * @author wuyouwulv
 *
 */
public class LazySingleton {
	private LazySingleton(){
		
	}
	
	private static LazySingleton instance;
	
	// 可以在该方法上加同步，性能较低
	public static LazySingleton getInstance(){
		if(null == instance){
			instance = new LazySingleton();
		}
		
		return instance;
	}
	
	public void doSometing(){
		System.out.println("Lazy Singleton");
	}
	
	public static void main(String[] args){
		LazySingleton lazySingleton = LazySingleton.getInstance();
		lazySingleton.doSometing();
	}
}
