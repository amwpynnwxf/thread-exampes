package com.samples.design.strategy;

public class MD5Strategy implements EncryptStrategy {

	@Override
	public void encrypt(String words) {
		System.out.println("MD5���ܺ�MD5>" + words);
	}

}
