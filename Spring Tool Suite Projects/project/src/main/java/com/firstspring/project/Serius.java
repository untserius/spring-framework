package com.firstspring.project;

public class Serius {

	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age is assigned...");
		this.age = age;
	}

	Serius(){
		System.out.println("Object is getting created...");
	}

	public void code() {
		System.out.println("I am coding...");
	}

}
