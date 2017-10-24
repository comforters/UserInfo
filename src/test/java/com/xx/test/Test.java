package com.xx.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.xx.dao.UserInfoDao;
import com.xx.service.UserInfoService;

public class Test {
	public void select(){
		ApplicationContext aContext=new ClassPathXmlApplicationContext("Spring_mybatis.xml");
		UserInfoService userInfoService=(UserInfoService)aContext.getBean("userInfoServiceImpl");
		System.out.println(userInfoService.selectUserById(666)); 
	}
	public static void main(String[] args) {
		Test test=new Test();
		test.select();
	}
}
