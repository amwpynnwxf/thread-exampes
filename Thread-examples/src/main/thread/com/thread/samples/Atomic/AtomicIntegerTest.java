package com.thread.samples.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

	public static void main(String[] args) {
		AtomicInteger atomicInt = new AtomicInteger(50);
		int val = atomicInt.incrementAndGet();
		System.out.println(val);
		
	}
}
