package com.jdc.mmp.polymorphism;

public class Hero extends Actor {

	public Hero(String name) {
		super(name);
	}
	
	public void greet() {
		System.out.println("Hey Man!");
	}
	
	@Override
	public void work() {
		System.out.println(super.getName() + " is working");
	}

	@Override
	void fight() {
		System.out.println(super.getName() + " is fighting");
	}

}
