package com.firstspring.project;

public class Serius {

	private int age;
	private Computer com;

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		System.out.println("Age is assigned...");
//		this.age = age;
//	}

	Serius(){
		System.out.println("Object is getting created...");
	}

	Serius(int age){
		System.out.println("Parameterized constructor activated...");
		this.age = age;
	}

	public void code() {
		System.out.println("I am coding...");
		com.compile();
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
}
