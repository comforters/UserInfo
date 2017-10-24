package com.xx.entity;

import java.util.Arrays;

public class UserInfo {
	private String userName;
	private String sex;
	private int id;
	private int age;
	private String [] loves;
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String userName, String sex, int id, int age, String[] loves) {
		super();
		this.userName = userName;
		this.sex = sex;
		this.id = id;
		this.age = age;
		this.loves = loves;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getLoves() {
		return loves;
	}
	public void setLoves(String[] loves) {
		this.loves = loves;
	}
	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", sex=" + sex + ", id=" + id + ", age=" + age + ", loves="
				+ Arrays.toString(loves) + "]";
	}
	
}
