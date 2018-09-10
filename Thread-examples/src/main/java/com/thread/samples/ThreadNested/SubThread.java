package com.thread.samples.ThreadNested;

public class SubThread extends Thread {
	public boolean wait = false;
	public String lock = "x";
	
	@Override
	public void run(){
		int i = 0;
		
		synchronized (lock) {
			while(true){
				i++;
				if(i % 2 == 0){
					lock.notifyAll();
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				
				System.out.println("×ÓÏß³Ì" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
