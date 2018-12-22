package com.samples.design.strategy;

/**
 * ����ģʽ������ʾ��
 * ������ɫ��������ԡ�������ԡ������ķ�װ��(context,�Բ�����ϼ��ṩ����ʹ�����)
 * ���˹۵㣺�ǳ��򵥵�ģʽ����Ϲ�ϵ������
 * @author wuyouwulv
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		EncryptContext context = new EncryptContext(new MD5Strategy());
		context.encrypt("�û�����Abc888");

		EncryptContext context2 = new EncryptContext(new SHA1Strategy());
		context2.encrypt("�˻�����123456");
	}

}
