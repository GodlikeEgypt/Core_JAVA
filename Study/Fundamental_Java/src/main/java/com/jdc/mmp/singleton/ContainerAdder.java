package com.jdc.mmp.singleton;

public class ContainerAdder {
	private Singleton container;
	
	public ContainerAdder() {
		container = Singleton.Name;
	}
	
	public void addName(String name) {
		container.addName(name);
	}
}
