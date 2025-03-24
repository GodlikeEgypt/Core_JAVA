package com.jdc.mmp.singleton;

public class ContainerTest {
	public static void main(String[] args) {
		ContainerAdder add = new ContainerAdder();
		add.addName("Hello");
		
		Singleton singleton = Singleton.Name;
		
		for(String s: singleton.nameList) {
			System.out.println(s);
		}
	}
}
