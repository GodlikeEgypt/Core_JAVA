package com.jdc.mmp.Inheritance;

public class Car {
	protected int gearpower;
	
	public Car(int gearpower) {
		this.gearpower = gearpower;
	}
	
	protected void drive() {
		System.out.printf("This car is driving with speed %d km", gearpower);
	}
}
