package com.samples.design.proxy;

/**
 * 静态代理模式
 * 和装饰器模式实现很像，实际运用应该按场景区分
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
