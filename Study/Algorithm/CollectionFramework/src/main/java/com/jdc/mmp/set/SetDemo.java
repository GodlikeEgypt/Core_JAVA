package com.jdc.mmp.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class SetDemo {
	
	Collection<Integer> demo1 = new HashSet<Integer>();
	Collection<Integer> demo2 = new TreeSet<Integer>();
	Collection<Integer> demo3 = new LinkedHashSet<Integer>();
	
	@Test
	void test() {
		for (int i = 10; i > 0; i --) {
			demo1.add(i);
			demo2.add(i);
			demo3.add(i);
		}
		
		System.out.println("HashSet : " + demo1);
		System.out.println("TreeSet : " + demo2);
		System.out.println("LinkedHashSet : " + demo3);		
	}
	
}
