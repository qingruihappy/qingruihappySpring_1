package com.qingruihappy4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qingruihappy4.dao.UserDaoc;
import com.qingruihappy4.service.LogService;
import com.qingruihappy4.service.UserService;



//user 服务层
@Service
public class UserServiceImplc implements UserService {
	@Autowired
	private UserDaoc userDao;
	@Autowired
	private LogService logService;
	
	@Transactional
	public void add() {
		// 调用接口的时候 接口失败 需要回滚，但是日志记录不需要回滚。
		logService.addLog(); // 后面程序发生错误，不能影响到我的回滚### 正常当addLog方法执行完毕，就应该提交事务
		userDao.add("test001", 20);
		int i = 1 / 0;
		System.out.println("################");
		userDao.add("test002", 21);

	}
	// 方法执行完毕之后，才会提交事务

	public void del() {
		System.out.println("del");
	}

}
