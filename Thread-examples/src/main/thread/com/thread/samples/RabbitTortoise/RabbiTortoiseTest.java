package com.thread.samples.RabbitTortoise;

/**
 * 龟兔赛跑示例，线程终止案例(线程终止另一个线程)
 * 用stop终止线程太过暴力，会强行终止正在进行的线程，并且是不安全的
 * 正常做法应该用一个开关去在业务中正常终止线程
 * @author wuyouwulv
 *
 */
public class RabbiTortoiseTest {

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		Tortoise tortoise = new Tortoise();
		LetOneStop rabbitCallBack = new LetOneStop(tortoise);
		LetOneStop tortoiseCallBack = new LetOneStop(rabbit);
		rabbit.callToBack = rabbitCallBack;
		tortoise.callToBack = tortoiseCallBack;
		
		tortoise.start();
		rabbit.start();
	}

}
