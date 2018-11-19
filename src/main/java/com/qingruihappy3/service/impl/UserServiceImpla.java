package com.qingruihappy3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qingruihappy3.annotation.ExtTransaction;
import com.qingruihappy3.dao.UserDaoa;
import com.qingruihappy3.service.UserService;

//user 服务层
@Service
public class UserServiceImpla implements UserService {
	@Autowired
	private UserDaoa userDao;

	/*
	 * 声明：@Transactional 或者XML方式 方法执行开始执行前，开启提交事务
	 */
	@ExtTransaction
	public void add() {
		userDao.add("test001", 20);
		 int i = 1 / 0;
		 System.out.println("################" + i);
		userDao.add("test002", 21);
		// 获取当前事务，手动进行回滚
	}

	// 方法执行完毕之后，才会提交事务
	public void del() {
		System.out.println("del");
	}

}
