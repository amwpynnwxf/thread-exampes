package com.samples.design.singleton;

/**
 * ����ģʽ��double-check��������̰߳�ȫ������Ҳ��
 * @author wuyouwulv
 *
 */
public class DoubleCheckSingleton {
	private DoubleCheckSingleton(){
		
	}
	
	private static DoubleCheckSingleton instance;
	
	public static DoubleCheckSingleton getInstance(){
		if(null == instance){
			synchronized(DoubleCheckSingleton.class){//����ط���ͬ��class������intance����Ϊ��ʱintanceΪnull
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
