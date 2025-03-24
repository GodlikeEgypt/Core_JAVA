package com.jdc.mmp.Inheritance;

public class Truck extends Car{
	
	public Truck() {
		super(40);
	}
	
	@Override
	public void drive() {
		System.out.printf("Truck is drive with %d speed", gearpower);
	}
}
