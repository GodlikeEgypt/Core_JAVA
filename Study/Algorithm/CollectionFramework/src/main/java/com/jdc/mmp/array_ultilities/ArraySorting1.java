package com.jdc.mmp.array_ultilities;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArraySorting1 {

	String name = "Hello Java Devloper is Zeo";

	@Test
	void test() {

		String[] array = name.split(" ");

		final class InnerClass {
			void showArray(String[] array) {
				System.out.print("[");

				for (int i = 0; array.length > i; i++) {
					if (i > 0) {
						System.out.print(", ");
					}
					System.out.print(array[i]);
				}

				System.out.println("]");
			}
		}

		InnerClass inner = new InnerClass();
		inner.showArray(array);
		
		Arrays.sort(array);
		inner.showArray(array);
	}

}
