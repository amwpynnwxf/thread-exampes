package com.samples.design.template;

public class MakeBlackTea extends AbstractMakeTea {

	@Override
	protected void brew() {
		System.out.println("��100��C��ˮ�ݺ��");
	}

	@Override
	protected boolean isWashTea() {
		return true;
	}

}
