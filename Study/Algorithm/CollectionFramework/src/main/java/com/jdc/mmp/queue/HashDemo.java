package com.jdc.mmp.queue;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

public class HashDemo {
	
	String[] array = {"Maung", "Aung", "Ba"};
	
	Map<Integer, String> hashMap = new HashMap<Integer, String>();
	Map<Integer, String> treeMap = new TreeMap<Integer, String>();
	
	@Test
	void test() {
		
		for(int i = array.length; i >0; ) {
			hashMap.put(i--, array[i]);
		}
		
		treeMap.putAll(hashMap);

		System.out.println(hashMap);
		System.out.println(treeMap);
	}
}
