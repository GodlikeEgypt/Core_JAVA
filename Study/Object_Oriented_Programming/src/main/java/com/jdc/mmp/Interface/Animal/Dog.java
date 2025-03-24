package com.jdc.mmp.Interface.Animal;

public class Dog extends Canine implements Pet{
	public Dog() {
		
	}
	
	@Override
	public void eat() {
		System.out.println("Dog bites bones!");
	};
	
	public void handShake() {
		System.out.println("Dog does HandShake!");
	}
}
