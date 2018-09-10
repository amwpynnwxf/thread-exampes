package com.thread.samples.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class KFC {
	String[] names = {"薯条", "鸡翅", "汉堡", "可乐"};
	int MAX = 20;
	int index = 0;
	List<Food> foods = new ArrayList<Food>();
	
	public void produce(int amount){
		synchronized(this){
			String threadName = Thread.currentThread().getName();
			while(foods.size() + amount > MAX){// 不能用if, 因为线程唤醒后需要重新判断条件
				System.out.println("生产者" + threadName + ": 食物够啦, 还剩" + foods.size());
				this.notifyAll();
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			for(int i=0; i<amount; i++){
				index ++;
				Food food = new Food(names[(int) (Math.random() * 4)] + (index));
				foods.add(food);
				System.out.println(threadName + "生产了" + food.getName() + "剩余食物" + foods.size());
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void consume(int amount){
		synchronized (this) {
			String threadName = Thread.currentThread().getName();
			while(foods.size() < amount){
				System.out.println("消费者" + threadName + "：食物吃完了");
				this.notifyAll();
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			for(int i=0; i<amount; i++){
				Food food = foods.remove(foods.size() - 1);
				System.out.println(threadName + "消费了一个" + food.getName() + "剩余食物" + foods.size());
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
