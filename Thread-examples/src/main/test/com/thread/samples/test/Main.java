package com.thread.samples.test;


public class Main {
	 public static void main(String[] args){
		 System.out.println("����main�����������Super�������i��"+Sub.i);
		 Sub sub = new Sub();
	 }
	 
	}
	class Super{
	 {
	 System.out.println("����Super��Ա��");
	 }
	 public Super(){
	 System.out.println("����Super���췽��");
	 }
	 {
	 int j = 123;
	 System.out.println("����Super��Ա���еı���j��"+j);
	 }
	 static{
	 System.out.println("����Super��̬��");
	 i = 123;
	 }
	 protected static int i = 1;
	}
	class Sub extends Super{
	 static{
	 System.out.println("����Sub��̬��");
	 }
	 public Sub(){
	 System.out.println("����Sub���췽��");
	 }
	 {
	 System.out.println("����Sub��Ա��");
	 }
	}
