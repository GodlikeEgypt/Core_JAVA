package com.jdc.mmp.abstraction;

public abstract class Shape {
	protected double height;
	protected double width;
	
	protected Shape(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public abstract double getArea();
}
