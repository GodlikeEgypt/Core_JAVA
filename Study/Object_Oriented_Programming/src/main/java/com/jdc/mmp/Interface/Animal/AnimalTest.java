package com.jdc.mmp.Interface.Animal;

public class AnimalTest {
	public static void main(String[] args) {
		Animal hippo = new Hippo();
		
		eat(new Lion());
		eat(hippo);
	
		handShake(new Dog());
		handShake(new Cat());
	}
	
	public static void eat(Animal animal) {
		animal.eat();
	}
	
	public static void handShake(Pet pet) {
		pet.handShake();
	}
	
}
