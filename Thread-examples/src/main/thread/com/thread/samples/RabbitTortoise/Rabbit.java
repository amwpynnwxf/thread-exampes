package com.thread.samples.RabbitTortoise;


/**
 * ����������0.5�ף�ÿ2����Ϣ1��
 * @author wuyouwulv
 *
 */
public class Rabbit extends Animal {
	public Rabbit(){
		setName("����");
	}
	
	@Override
	public void running() {
		double dis = 0.5;
		length -= dis;
		if(length <= 0){
			length = 0;
			System.out.println("���ӻ����ʤ��");
			if(callToBack != null){
				callToBack.win();
			}
		}else{
			System.out.println("��������" + dis + "�ף������յ㻹��" + String.format("%.1f", length) + "��");
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
