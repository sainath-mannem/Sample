package com.sainath.java.examples.poli;

public abstract class Animal implements AnimalContract {

	private String name;
	
	/*public Animal() {}*/
	
	public Animal(String name) {
		this.name = name;
	}
	
	
	@Override
	public void eat(String item) {
		System.out.println(name + " eating "+ item);
	}

	@Override
	public void sleep() {
		System.out.println(name+" Sleeping on the roads");
	}


	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		//Animal animal = new Tiger("Tiger");
		//animal.aravu();
		//Animal animal1 = new Dog();
		//animal.aravu();
		
		Animal a1 = new Dog("dog");
		a1.sleep();
		
		a1 = new PetDog("pet");
		a1.sleep();
	}
	
}
