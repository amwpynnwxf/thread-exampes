package com.thread.samples.RabbitTortoise;

public abstract class Animal extends Thread {
	public double length = 10; // 比赛长度
	public boolean stopMe = false; // 控制线程终止
	
	public abstract void running(); // 赛跑抽象方法

	@Override
	public void run() {
		while(!stopMe && length > 0){
			running();
		}
	}
	
	/*定义用于执行win回调的内部接口和实例
	    （接口定义在内部，实现类又定义在外部, 是否统一全部为内部类或全部外部更为合理)*/
	public static interface CallToBack{
		public void win();
	}
	
	public CallToBack callToBack;
}
