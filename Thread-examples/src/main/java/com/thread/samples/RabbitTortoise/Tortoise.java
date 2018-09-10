package com.thread.samples.RabbitTortoise;


/**
 * 乌龟每秒跑0.1米，不休息
 * @author wuyouwulv
 *
 */
public class Tortoise extends Animal {
	public Tortoise(){
		setName("乌龟");
	}
	
	@Override
	public void running() {
		double dis = 0.1;
		length -= dis;
		if(length <= 0){
			length = 0;
			System.out.println("乌龟赢得了胜利");
			if(callToBack != null){
				callToBack.win();
			}
		}else{
			System.out.println("乌龟跑了" + dis + "米，距离终点还有" + String.format("%.1f", length) + "米");
		}
		
		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch(Exception e){
			System.out.println("exception state:" + Thread.currentThread().getState().toString());
			e.printStackTrace();
		}
	}

}
