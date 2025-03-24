package com.jdc.mmp.constantVariable;

public class ConstantVariable {
	
	static final int last;
	
	static {
		last = 10;
	}
	
	static final int Mon = 1;
	static final int Tue = 2;
	static final int Wed = 3;
	static final int Thu = 4;
	static final int Fri = 5;
	static final int Sat = 6;
	static final int Sun = 7;
	
	public static void main (String [] args) {
		showDay(1);
	}

	private static void showDay(int day) {
		switch (day) {
			case 1:
			System.out.println("Monday");
			break;
			
			case 2:
			System.out.println("Tueday");
			break;
			
			default:
			break;
		}	
	}
}
