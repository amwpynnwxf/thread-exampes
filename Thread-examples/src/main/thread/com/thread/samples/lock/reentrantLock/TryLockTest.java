package com.thread.samples.lock.reentrantLock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * tryLock ���Ի�������ò�����������ִ��
 * @author wuyouwulv
 *
 */
public class TryLockTest {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	Lock lock = new ReentrantLock();
	
	public static void main(String[] args){
		TryLockTest test = new TryLockTest();
		new Thread(){
			public void run(){
				test.insert(Thread.currentThread());
			}
		}.start();
		
		new Thread(){
			public void run(){
				test.insert(Thread.currentThread());
			}
		}.start();
	}
	
	private void insert(Thread thread){
		if(lock.tryLock()){
		//if(lock.tryLock(100, TimeUnit.MILLISECONDS)){	// ���������ò�����ʱ��ȴ�һ����ʱ�䣬��ʱ������֮��������ò��������ͷ���false
			try{
				System.out.println(thread.getName() + "�õ�����");
				for(int i=0; i<5; i++){
					list.add(i);
				}
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				System.out.println(thread.getName() + "�ͷ�����");
				lock.unlock();
			}
		}else{
			System.out.println(thread.getName() + "δ�����");
		}
		
	}
}
