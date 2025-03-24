package com.jdc.mmp.composition;

import java.util.Scanner;

public class MyScanner {
	
	//Has A Relation!
	private Scanner scanner;
	
	public MyScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public String scanLine(String message) {
		System.out.println(message);
		return scanner.next();
	}
	
}
