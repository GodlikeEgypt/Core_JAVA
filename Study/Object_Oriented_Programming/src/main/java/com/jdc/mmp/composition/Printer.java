package com.jdc.mmp.composition;

public class Printer {
	
	//Has A Relation!
	private MyScanner myscanner;
	
	public Printer(MyScanner myscanner) {
		this.myscanner = myscanner;
	}
	
	public void print(String message) {
		String result = myscanner.scanLine(message);
		System.out.printf("You said : %s%n", result);
	}
}
