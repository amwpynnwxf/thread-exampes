package com.thread.samples.hash;



public class HashCodeTest {
	public String s = "f";
	

	public static void main(String[] args) {
		String s = "aaa";
		String s2 = "aaa";
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		HashCodeTest t = new HashCodeTest();
		HashCodeTest t2 = new HashCodeTest();
		System.out.println(t.equals(t2));
		
		
	}

}
