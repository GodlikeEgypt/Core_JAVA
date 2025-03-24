package com.jdc.mmp.constantVariable;

public class Enum {
	
	enum Myself{Myat, Min, Paing};
	
	public static void main (String [] args) {
		greet(Myself.Myat);
	}

	private static void greet(Myself name) {
		name = Myself.Min;
		System.out.println(name);		
	}
	
	
}
