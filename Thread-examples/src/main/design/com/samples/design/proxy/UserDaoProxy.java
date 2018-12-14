package com.samples.design.proxy;

public class UserDaoProxy implements UserDao {
	private UserDao userDaoImpl;
	
	@Override
	public void save() {
		userDaoImpl.save();
		System.out.println("do save log...");
	}

	@Override
	public void delete() {
		userDaoImpl.delete();
		System.out.println("do delete log...");
	}


	public UserDao getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

}
