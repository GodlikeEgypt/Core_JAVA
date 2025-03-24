package com.jdc.mmp.Interface.Things;

public class Sky {
	private Vehicle v;
	
	public Sky (Vehicle v) {
		this.v = v;
	}
	
	public void drive() {
		v.drive();
	}
	
	public static void main(String[] args) {
		Sky car = new Sky (new Car());
		car.drive();
		
		Sky aeroplane = new Sky (new Aeroplane());
		aeroplane.drive();
		
		Sky car1 = new Sky(VehicalFactory.getInstance(Car.class));
		car1.drive();
		
		Sky aeroplane1 = new Sky(VehicalFactory.getInstance(Aeroplane.class));
		aeroplane1.drive();
	}
}
