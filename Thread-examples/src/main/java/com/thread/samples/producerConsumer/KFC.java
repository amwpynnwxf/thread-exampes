package com.thread.samples.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class KFC {
	String[] names = {"����", "����", "����", "����"};
	int MAX = 20;
	int index = 0;
	List<Food> foods = new ArrayList<Food>();
	
	public void produce(int amount){
		synchronized(this){
			String threadName = Thread.currentThread().getName();
			while(foods.size() + amount > MAX){// ������if, ��Ϊ�̻߳��Ѻ���Ҫ�����ж�����
				System.out.println("������" + threadName + ": ʳ�ﹻ��, ��ʣ" + foods.size());
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
				System.out.println(threadName + "������" + food.getName() + "ʣ��ʳ��" + foods.size());
				
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
				System.out.println("������" + threadName + "��ʳ�������");
				this.notifyAll();
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			for(int i=0; i<amount; i++){
				Food food = foods.remove(foods.size() - 1);
				System.out.println(threadName + "������һ��" + food.getName() + "ʣ��ʳ��" + foods.size());
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
