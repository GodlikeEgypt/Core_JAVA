package com.jdc.mmp.singleton;

public enum Singleton {
	Name;

	String[] nameList;

	private Singleton() {
		nameList = new String[0];
	}

	public String[] getArray() {
		return nameList;
	}

	public void addName(String name) {
		String[] temp = new String[nameList.length + 1];

		for (int i = 0; i < nameList.length; i++) {
			temp[i] = nameList[i];
		}
		
		temp[temp.length-1] = name;
		nameList = temp;
	}
}
