package com.java.jstl;

public class UserBean {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String submit() {
		System.out.println("Age Submitted"+age);
		return "success";
	}
}
