package com.samples.design.singleton;

/**
 * ����������ģʽ
 * @author wuyouwulv
 *
 */
public class HungerSingleton {
	private HungerSingleton(){
		
	}
	
	private static HungerSingleton instance = new HungerSingleton();
	
	public static HungerSingleton getInstance(){
		return instance;
	}
	
	public void doSometion(){
		System.out.println("Hunger Singleton");
	}
	
	public static void main(String[] args){
		HungerSingleton  simpleSingleton = HungerSingleton.getInstance();
		simpleSingleton.doSometion();
	}
}
