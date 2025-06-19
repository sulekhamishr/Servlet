package com.java.jsf;

public class AgeBean {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public AgeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String submit() {
		System.out.println("Successfully");
		return "Success";
	}

}
