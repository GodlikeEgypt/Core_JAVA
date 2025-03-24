package com.jdc.mmp.abstraction;

public class ShapeTest {
	public static void main(String[] args) {
		Shape R1 = new Shape(4, 8) {
			@Override
			public double getArea() {
				return width * height;
			}
		};
		showArea(R1);
	}

	private static void showArea(Shape shape) {
		System.out.println(shape.getArea());		
	}
	
	

}
