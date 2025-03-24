package com.jdc.mmp.string.ep01;

import org.junit.jupiter.api.Test;

public class CreationDemo {
	
	@Test
	void test() {
		String name = new String("Hello Java lol");
		
//		System.out.println(name.charAt(2));
//		System.out.println(name.substring(0));
//		System.out.println(name.substring(6));
//		System.out.println(name.substring(6, 10));
//		System.out.println(name.contains("o"));
//		System.out.println(name.indexOf("l"));
//		System.out.println(name.lastIndexOf("l"));
//		
//		String number = new String("Java 21 & Kotlin 1.8");
//		System.out.println(number.replaceFirst("\\d", "p"));
//		System.out.println(number.replaceAll("\\d", "p"));
//		
//		String upper = name.toUpperCase();
//		String lower = name.toLowerCase();
//		System.out.println(upper.equals(lower));
//		System.out.println(upper.equalsIgnoreCase(lower));
		
		String lesson = "Java, Database, Kotlin, Servlet";
		String[] array = lesson.split("a", 3);
		
		for(String s: array) {
			System.out.print(s);
		}
	}
}
