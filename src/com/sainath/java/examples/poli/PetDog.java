package com.sainath.java.examples.poli;

public class PetDog extends Dog{

	public PetDog(String name) {
		super(name);
	}

	@Override
	public void sleep() {
		System.out.println("Sleeps in the house");
	}

	
}
