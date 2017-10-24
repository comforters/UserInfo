package com.xx.model;

import java.util.Arrays;

public class UserInfoModel {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String [] loves;
	public UserInfoModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfoModel(int id, String name, int age, String sex, String[] loves) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.loves = loves;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String[] getLoves() {
		return loves;
	}
	public void setLoves(String[] loves) {
		this.loves = loves;
	}
	@Override
	public String toString() {
		return "UserInfoModel [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", loves="
				+ Arrays.toString(loves) + "]";
	}
	
}
