package com.samples.design.singleton;

/**
 * 单例模式：double-check，解决了线程安全，性能也好
 * @author wuyouwulv
 *
 */
public class DoubleCheckSingleton {
	private DoubleCheckSingleton(){
		
	}
	
	private static DoubleCheckSingleton instance;
	
	public static DoubleCheckSingleton getInstance(){
		if(null == instance){
			synchronized(DoubleCheckSingleton.class){//这个地方是同步class而不是intance，因为此时intance为null
				if(null == instance){
					instance = new DoubleCheckSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public void doSometing(){
		System.out.println("DoubleCheck singleton");
	}
	
	public static void main(String[] args){
		DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
		doubleCheckSingleton.doSometing();
	}
}
