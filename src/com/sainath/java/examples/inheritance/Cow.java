package com.sainath.java.examples.inheritance;

public class Cow extends Animal {

	public Cow(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}

	//@Override
	public String getEatingHabits() {
		return "Herbirous";
	}
	
}
