package com.jdc.mmp.singleton;

public class Container {
	
	private String[] nameList;
	public static Container createInstance;
	
	public static Container getInstance() {
		if (null == createInstance) {
			createInstance = new Container();
		}
		
		return createInstance;
	}
	
	private Container() {
		nameList = new String[0];
	}
	
	public String[] getList() {
		return nameList;
	}
	
	public void addName(String str) {
		String[] temp = new String[nameList.length+1];
		
		for(int i = 0; i < nameList.length; i++) {
			temp [i] = nameList[i];
		}
		
		temp[temp.length-1] = str;
		nameList = temp;
	}
}
