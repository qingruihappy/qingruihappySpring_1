package com.qingruihappy1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qingruihappy1.dao.UserDao;
import com.qingruihappy1.service.UserService;



//user 服务层
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	 //声明：@Transactional 或者XML方式
	 //方法执行开始执行前，开启提交事务
	 @Transactional
	 public void add() {
	 userDao.add("test001", 20);
	 int i = 1 / 0;
	 System.out.println("################" + i);
	 userDao.add("test002", 21);
	 
		 //注意下面的代码是不会回滚的，因为异常给吃掉了，所以是不会回滚的。
	 //因为回滚的机制在异常中的，现在吃掉异常之后就不会进入异常的方法中，所以自然而然的不会回滚的。
/*	 try {
		userDao.add("test001", 20);
		 int i = 1 / 0;
		 System.out.println("################" + i);
		 userDao.add("test002", 21);
	} catch (Exception e) {
		e.printStackTrace();
	}*/
	
	 }
	// 方法执行完毕之后，才会提交事务



}
