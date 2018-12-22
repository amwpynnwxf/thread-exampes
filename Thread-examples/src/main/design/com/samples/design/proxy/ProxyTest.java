package com.samples.design.proxy;

/**
 * ��̬����ģʽ
 * ��װ����ģʽʵ�ֺ���ʵ������Ӧ�ð���������
 * @author wuyouwulv
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		UserDao userDaoImpl = new UserDaoImpl();
		UserDaoProxy userDaoProxy = new UserDaoProxy();
		userDaoProxy.setUserDaoImpl(userDaoImpl);
		userDaoProxy.save();
		userDaoProxy.delete();
	}

}
