package com.samples.design.template;

/**
 * �������
 * @author wuyouwulv
 *
 */
public abstract class AbstractMakeTea {
	/**
	 * �ݲ�ģ�巽��
	 * ����Ϊfinal��ֹ������д
	 */
	public final void makeTea(){
		boilWater();
		
		brew();
		
		if(isWashTea()){//�����Ҫϴ��:�Ƚ���һ�εĲ�ˮ������������һ��
			pourOut();
			brew();
		}
		
		pourInCup();
	}
	
	private void boilWater(){
		System.out.println("�տ�ˮ...");
	}
	
	private void pourInCup(){
		System.out.println("���赹�뱭��");
	}
	
	private void pourOut(){
		System.out.println("����֭����");
	}
	
	/**
	 * �Ƿ�Ҫϴ��
	 * �ṩĬ��ʵ��
	 * @return
	 */
	protected boolean isWashTea(){
		return false;
	}
	
	/**
	 * �ݲ�
	 */
	protected abstract void brew();
	
}
