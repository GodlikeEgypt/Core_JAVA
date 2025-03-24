package com.jdc.mmp.polymorphism;

public class Enemy extends Actor{

	public Enemy(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(getName() + " is Laughing!");
	}

	@Override
	void fight() {
		System.out.println(getName() + " wants to fight with you!");
	}

}
