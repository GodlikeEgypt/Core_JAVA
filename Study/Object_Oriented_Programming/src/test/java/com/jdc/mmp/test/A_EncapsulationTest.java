package com.jdc.mmp.test;

import com.jdc.mmp.encapsulation.User;
import com.jdc.mmp.encapsulation.UserInterface;

public class A_EncapsulationTest {
	
	public static void main(String[] args) {
		User u1 = new User("Myat Min Paing", 23);
		
		UserInterface u2 = u1;
		
		System.out.println(u2.getName());
		System.out.println(u2.getAge());
	}
	
	
	
}
