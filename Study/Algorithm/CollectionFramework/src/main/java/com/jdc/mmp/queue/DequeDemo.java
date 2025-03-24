package com.jdc.mmp.queue;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.jupiter.api.Test;

public class DequeDemo {
	
	Deque<Integer> dequ = new ArrayDeque<Integer>();
	
	@Test
	void test() throws InterruptedException {
		
		for(int i = 0; i <= 10; i++) {
			
			if (i % 2 == 0) {
				dequ.addFirst(i);			
			} else {
				dequ.addLast(i);
			}
		}
		
		while(!dequ.isEmpty()) {
			System.out.println(dequ.removeLast());
			Thread.sleep(1000);
		}
	}
	
}
