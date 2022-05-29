package com.sainath.java.examples.inheritance;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Cow("X", "F", 4);
		animal.getEatingHabits();
		Animal dog = new Dog("X", "F", 4);
		dog.getEatingHabits();
		
		AnimalFeatures animalFeatures = new AnimalFeaturesImpl();
		animalFeatures.getAge(animal);
	}
}
