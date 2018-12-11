package com.samples.design.singleton;

/**
 * ����ģʽ������ģʽ[���̰߳�ȫ]
 * @author wuyouwulv
 *
 */
public class LazySingleton {
	private LazySingleton(){
		
	}
	
	private static LazySingleton instance;
	
	// �����ڸ÷����ϼ�ͬ�������ܽϵ�
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
