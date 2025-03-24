package com.jdc.mmp.Interface.Things;

public class VehicalFactory {
	
	public static <T extends Vehicle> Vehicle getInstance (Class<T> type) {
		
		if(type.equals(Car.class)) {
			return new Car();
		} else {
			return new Aeroplane();
		}
		
	}
	
}
