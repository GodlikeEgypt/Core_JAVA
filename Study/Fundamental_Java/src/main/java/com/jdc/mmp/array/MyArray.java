package com.jdc.mmp.array;

public class MyArray {
	
	public static void main(String[] args) {
		String[] nameList = {"Kaung", "Myat", "Khun", "Si"};
//		String[] joblist = {"Korean", "Japan", "Car", "Sale"};

		list(nameList);
	}
	
	public static void list(String[] nameList) {
		
		for (String i : nameList) {
			System.out.println(i);
		}
	}
	
}
