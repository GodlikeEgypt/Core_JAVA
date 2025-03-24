package com.jdc.mmp.polymorphism;

public abstract class Actor implements GameItem{
	private String name;
	
	public Actor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	abstract void fight();
}
