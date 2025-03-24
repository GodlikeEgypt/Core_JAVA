package com.jdc.mmp.integer_literals;

import org.junit.jupiter.api.Test;

public class NumberTest {
	
	@Test
	void test() {
		
//		String binary = getNumberTypes(267, 2);
//		System.out.printf("Binary number of %d is %s %n",267, binary);
//		System.out.printf("Binary nubmer %s is %d %n", binary, Integer.valueOf(binary, 2));
//		System.out.println();
//		
//		String octal = getNumberTypes(267, 8);		
//		System.out.printf("Octal number of %d is %s  %n", 267, octal);
//		System.out.printf("Octal number %s is %d %n", octal, Integer.decode(octal));
//		System.out.println();
//		
//		String hexa = getNumberTypes(267, 16);		
//		System.out.printf("Hexa number of %d is %s  %n", 267, hexa);
//		System.out.printf("Hexa number %s is %d %n", hexa, Integer.decode(hexa));

		System.out.println(getHashCode("Hello").hashCode());
		
	}
	
	String getHashCode(String name) {
		return name;
	}
	
	String getNumberTypes(int data, int format) {
		
		StringBuilder sb = new StringBuilder();
		
		while(data > 0) {
			sb.append(data % format);
			data = (data / format);
		}
		
		sb.reverse();
		sb.insert(0, getPrefix(format));
		
		return sb.toString();
	}
	
	String getPrefix (int format) {
		String prefix = null;
		switch(format) {
			case 2 : 
				prefix = "";
				break;
			case 8 :
				prefix = "0";
				break;
			case 16 :
				prefix = "0x";
				break;
			default :
				break;
		}
		return prefix;
	}
}
