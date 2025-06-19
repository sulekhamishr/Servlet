package com.java.jsf;

public class AgeBean {
	
	public AgeBean() {}
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public AgeBean(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeBean [age=" + age + ", getAge()=" + getAge() + ", submit()=" + submit() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String submit() {
		System.out.println("Age Submitted"+age);
		return "success";
	}
}
