package com.jdc.mmp.encapsulation;

public class User implements UserInterface {
	
	private String name;
	private int age;
	
	public User (String name, int age) {
		this.name = name;
		
		if (age < 0) {
			throw new IllegalArgumentException("Age must be greater than zero!");
		}
		
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	
	
//	private void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	private void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
}
