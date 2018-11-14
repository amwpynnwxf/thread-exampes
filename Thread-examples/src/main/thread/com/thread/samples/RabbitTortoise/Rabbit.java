package com.thread.samples.RabbitTortoise;


/**
 * 兔子美妙跑0.5米，每2米休息1秒
 * @author wuyouwulv
 *
 */
public class Rabbit extends Animal {
	public Rabbit(){
		setName("兔子");
	}
	
	@Override
	public void running() {
		double dis = 0.5;
		length -= dis;
		if(length <= 0){
			length = 0;
			System.out.println("兔子获得了胜利");
			if(callToBack != null){
				callToBack.win();
			}
		}else{
			System.out.println("兔子跑了" + dis + "米，距离终点还有" + String.format("%.1f", length) + "米");
		}
		
		if(length % 2 == 0){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
