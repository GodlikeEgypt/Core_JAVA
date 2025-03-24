package com.jdc.mmp.polymorphism;

public class PolymorphismDemo {
	public static void main(String[] args) {
		Hero hero = new Hero("Myat Min Paing");
		work(hero);
		System.out.println();
		
		Enemy enemy = new Enemy("Lu Soe");
		work(enemy);
		
	}
	
	private static void work(Actor hero) {
		System.out.println("====Actor=====");
		hero.fight();
		hero.work();		
	}
	
}
