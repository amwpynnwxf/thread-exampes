package com.samples.design.strategy;

public class EncryptContext {
	private EncryptStrategy strategy;

	public EncryptContext(EncryptStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void encrypt(String words){
		strategy.encrypt(words);
	}
}
