package com.jdc.mmp.array_ultilities;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArraySorting2 {

	@Test
	void test() {

		int[] array = { 34, 53, 64, 43, 20 };

		final class Inner {
			void showArray(int[] array) {
				System.out.print("[");

				for (int i = 0; i < array.length; i++) {
					if (i > 0) {
						System.out.print(", ");
					}
					System.out.print(array[i]);
				}

				System.out.print("]");
			}
		}
		
		Inner inner = new Inner();
		Arrays.sort(array);
		inner.showArray(array);
	}

}
