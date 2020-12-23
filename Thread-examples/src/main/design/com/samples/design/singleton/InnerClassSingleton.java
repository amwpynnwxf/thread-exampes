package com.samples.design.singleton;

/**
 * ����ģʽ���ڲ���(�����ڲ������״η��ʲű����ص�������ʵ��)
 * ���ڲ�����Է����ⲿ��private��Դ
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
