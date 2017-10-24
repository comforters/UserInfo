package com.xx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xx.dao.UserInfoDao;
import com.xx.entity.UserInfo;
import com.xx.service.UserInfoService;
@Service 
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;
	@Override
	public List<UserInfo> selectUser() {
		return userInfoDao.selectUser();
	}

	@Override
	public void addUser(UserInfo userInfo) {
		userInfoDao.addUser(userInfo);
	}

	@Override
	public void delUserById(int id) {
		userInfoDao.delUserById(id);
	}

	@Override
	public UserInfo selectUserById(int id) {
		return userInfoDao.selectUserById(id);
	}

	@Override
	public void updateUser(UserInfo userInfo) {
		userInfoDao.updateUser(userInfo);
	}

}
