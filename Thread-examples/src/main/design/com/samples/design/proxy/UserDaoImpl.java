package com.samples.design.proxy;

public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("do save db");
	}

	@Override
	public void delete() {
		System.out.println("do delete db");
	}

}
