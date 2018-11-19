package com.qingruihappy3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qingruihappy3.service.UserService;


public class Test001 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserService userService = (UserService) applicationContext.getBean("userServiceImpla");
		userService.add();
	}

}
