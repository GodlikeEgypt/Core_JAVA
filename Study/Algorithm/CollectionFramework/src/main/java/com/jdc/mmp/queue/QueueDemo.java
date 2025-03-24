package com.jdc.mmp.queue;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

public class QueueDemo {
	
	Queue<Integer> qu = new LinkedList<Integer>();
	
	@Test
	void test() throws InterruptedException {
		for (int i = 0; i < 10; i ++) {
			qu.offer(i);
		}
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
			
			Thread.sleep(1000);
		}
		
	}
	
}
