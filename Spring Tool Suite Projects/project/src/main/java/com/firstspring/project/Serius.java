package com.firstspring.project;

public class Serius {

	private int age;
	private Laptop laptop;

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
		laptop.compile();
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}
