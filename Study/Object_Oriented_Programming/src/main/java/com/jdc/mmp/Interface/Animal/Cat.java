package com.jdc.mmp.Interface.Animal;

public class Cat extends Feline implements Pet{
	public Cat() {
		
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eats Fish!");
	}
	
	public void handShake() {
		System.out.println("Cat does HandShake!");
	}
}
