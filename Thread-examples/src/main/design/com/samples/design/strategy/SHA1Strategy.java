package com.samples.design.strategy;

public class SHA1Strategy implements EncryptStrategy {

	@Override
	public void encrypt(String words) {
		System.out.println("SHA1���ܺ�SHA1>" + words);
	}

}
