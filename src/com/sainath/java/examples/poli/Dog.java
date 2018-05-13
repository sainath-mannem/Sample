package com.sainath.java.examples.poli;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void aravu() {
		System.out.println(getName() + " bow bow");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+" Sleeping on the roads");
	}
}
