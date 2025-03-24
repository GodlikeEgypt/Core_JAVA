package com.jdc.mmp.composition;

import java.util.Scanner;

public class PrinterTest {
	
	public static void main(String[] args) {
		
		MyScanner myScanner = new MyScanner(new Scanner(System.in));
		Printer printer = new Printer(myScanner);
		
		printer.print("What is your name?");
	}
	

	
	
}
