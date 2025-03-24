package com.jdc.mmp.Enum;

public class enumeration {
	public static void main(String[] args) {
		Course [] course = Course.values();
		
		for (Course courses : course) {
			FeesShowable show = courses;
			show.showFeesWithFormat();
		}
		
		Course c = Course.valueOf("JavaSe");
		System.out.println(c);
	}
}
