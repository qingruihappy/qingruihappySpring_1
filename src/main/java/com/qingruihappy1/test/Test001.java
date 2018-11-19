package com.qingruihappy1.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qingruihappy1.service.UserService;


public class Test001 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
		userService.add();
	}

}
