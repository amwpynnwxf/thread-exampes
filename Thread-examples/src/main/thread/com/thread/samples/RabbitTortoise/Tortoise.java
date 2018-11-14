package com.thread.samples.RabbitTortoise;


/**
 * �ڹ�ÿ����0.1�ף�����Ϣ
 * @author wuyouwulv
 *
 */
public class Tortoise extends Animal {
	public Tortoise(){
		setName("�ڹ�");
	}
	
	@Override
	public void running() {
		double dis = 0.1;
		length -= dis;
		if(length <= 0){
			length = 0;
			System.out.println("�ڹ�Ӯ����ʤ��");
			if(callToBack != null){
				callToBack.win();
			}
		}else{
			System.out.println("�ڹ�����" + dis + "�ף������յ㻹��" + String.format("%.1f", length) + "��");
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
