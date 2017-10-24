package com.xx.service;

import java.util.List;

import com.xx.entity.UserInfo;

public interface UserInfoService {
	public List<UserInfo> selectUser();
	public void addUser(UserInfo userInfo);
	public void delUserById(int id);
	public UserInfo selectUserById(int id);
	public void updateUser(UserInfo userInfo);
}
