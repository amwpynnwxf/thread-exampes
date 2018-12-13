package com.samples.design.template;

/**
 * 抽象基类
 * @author wuyouwulv
 *
 */
public abstract class AbstractMakeTea {
	/**
	 * 泡茶模板方法
	 * 定义为final防止子类重写
	 */
	public final void makeTea(){
		boilWater();
		
		brew();
		
		if(isWashTea()){//如果需要洗茶:先将第一次的茶水倒掉，重新泡一遍
			pourOut();
			brew();
		}
		
		pourInCup();
	}
	
	private void boilWater(){
		System.out.println("烧开水...");
	}
	
	private void pourInCup(){
		System.out.println("将茶倒入杯中");
	}
	
	private void pourOut(){
		System.out.println("将茶汁倒掉");
	}
	
	/**
	 * 是否要洗茶
	 * 提供默认实现
	 * @return
	 */
	protected boolean isWashTea(){
		return false;
	}
	
	/**
	 * 泡茶
	 */
	protected abstract void brew();
	
}
