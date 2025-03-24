package com.jdc.mmp.Interface.Things;

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		drive(new Car());
		
		fly(new Aeroplane());
		fly(new Drone());
		
		Flyable bird = new Flyable() {
			
			@Override
			public void fly() {
				System.out.println("Bird is flying!");				
			}
		};
		
		fly(bird);
		bird.fly();
	}
	
	public static void drive(Vehicle vehicle) {
		vehicle.drive();
	}
	
	private static void fly(Flyable fly) {
		fly.fly();
	}
	
}
