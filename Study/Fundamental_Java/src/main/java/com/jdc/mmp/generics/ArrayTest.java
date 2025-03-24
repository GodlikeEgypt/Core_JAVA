package com.jdc.mmp.generics;

public class ArrayTest {
	public static void main(String[] args) {
		Array<String> ulArray = new UnlimitedArray<String>();
		
		ulArray.addData("Hello");
		ulArray.addData("I Miss You");
		
		System.out.println(ulArray.getIndex(0));
		System.out.println(ulArray.getIndex(1));
	}
}
