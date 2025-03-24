package com.jdc.mmp.Interface.Things;

public class Drone extends Toy implements Flyable{

	@Override
	public void play() {
		System.out.println("Drone is flying");
		
	}
	
	public void fly() {
		play();
	}

}
