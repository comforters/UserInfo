package com.xx.web.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.github.pagehelper.PageHelper;
import com.xx.entity.UserInfo;
import com.xx.model.UserInfoModel;
import com.xx.service.UserInfoService;


@Controller
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;
	@RequestMapping("user.do")
	public String addUser(UserInfoModel userInfoModel,WebRequest webRequest){
		UserInfo userInfo=new UserInfo();
		userInfo.setId(userInfoModel.getId());
		userInfo.setAge(userInfoModel.getAge());
		userInfo.setLoves(userInfoModel.getLoves());
		userInfo.setSex(userInfoModel.getSex());
		userInfo.setUserName(userInfoModel.getName());
		userInfoService.addUser(userInfo);
		List<UserInfo> list=userInfoService.selectUser();
		webRequest.setAttribute("list", list, WebRequest.SCOPE_SESSION);
		return "index";
	}
	@RequestMapping("del.do")
	public String delUser(int id,WebRequest webRequest){
		userInfoService.delUserById(id);
		PageHelper.startPage(1,10);
		List<UserInfo> list=userInfoService.selectUser();
		webRequest.setAttribute("list", list, WebRequest.SCOPE_SESSION);
		return "index";
	}
	@RequestMapping("edit1.do")
	public String editUser(int id,Model model){
		UserInfo userInfo=userInfoService.selectUserById(id);
		model.addAttribute("userinfo",userInfo);
		return "index2";
	}
	@RequestMapping("edit2.do")
	public String editUsers(UserInfoModel userInfoModel,WebRequest webRequest){
		UserInfo userInfo=new UserInfo();
		userInfo.setId(userInfoModel.getId());
		userInfo.setAge(userInfoModel.getAge());
		userInfo.setLoves(userInfoModel.getLoves());
		userInfo.setSex(userInfoModel.getSex());
		userInfo.setUserName(userInfoModel.getName());
		userInfoService.updateUser(userInfo);
		PageHelper.startPage(1,10);
		List<UserInfo> list=userInfoService.selectUser();
		webRequest.setAttribute("list", list, WebRequest.SCOPE_SESSION);
		return "index";
	}
	@RequestMapping("page.do")
	public String page(String pageNumber,String id, WebRequest webRequest){
		System.out.println(id);
		PageHelper.startPage(Integer.parseInt(pageNumber),10);
		List<UserInfo> list=userInfoService.selectUser();
		webRequest.setAttribute("list", list, WebRequest.SCOPE_SESSION);
		return "index3";
	}
}
