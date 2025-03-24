package com.jdc.mmp.generics;

public class UnlimitedArray <T> implements Array<T>{
	
	Object[] array;
	
	public UnlimitedArray() {
		array = new Object[] {};
	}
	
	@Override
	public void addData(T data) {
		Object[] temp = new Object[array.length + 1];
		
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		
		temp[temp.length-1] = data;
		array = temp;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getIndex(int index) {
		
		return (T) array[index];
	}
	

	
}
