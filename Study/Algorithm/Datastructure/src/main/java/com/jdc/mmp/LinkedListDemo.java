package com.jdc.mmp;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class LinkedListDemo {
	
	@Test
	void test() {
		
		LinkedList<String> stack = new LinkedList<String>();
		
		stack.offer("Hello");
		stack.offer("Myat");
		stack.push("Lin");
		
		stack.add(1, "Min");
		stack.remove(1);
		
		System.out.println(stack);
	}
	
}
