package com.thread.samples.test;

public class A extends B {
	// ��̬����
	
	// ��̬����
	static int i = 1;
	
	// �Ǿ�̬����
	int j = 1;
	// ��̬����
	static {
		i++;
		System.out.println("Class A2:static blocks" + i);
	}

	// ���캯��
	public A() {
		super();
		i++;
		j++;
		System.out.println("constructor A: " + "i=" + i + ",j=" + j);
	}

	// �Ǿ�̬����
	{
		i++;
		j++;
		System.out.println("Class A:common blocks" + "i=" + i + ",j=" + j);
	}

	// �Ǿ�̬����
	public void aDisplay() {
		i++;
		System.out.println("Class A:static void aDisplay(): " + "i=" + i
				+ ",j=" + j);
		return;
	}

	// ��̬����
	public static void aTest() {
		i++;
		System.out.println("Class A:static void aTest():    " + "i=" + i);
		return;
	}
	
	 public static void main (String args[]) {
	        A a=new A();
	        a.aDisplay();
	    }

}
