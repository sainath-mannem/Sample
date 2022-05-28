package com.sainath.java.examples;

public class Car extends Vechicle {

	@Override
	public void drive() {
		drive1();
		System.out.println("Car");
	}

	public Car(int wheels) {
		super(wheels);
	}

	public void drive1() {
		System.out.println(" drive1 Car");
	}
	@Override
	protected void tax() {
		
	}
	
	public static void main(String[] args) {
		Car c = new Car(2);
		//c.drive();
		
		Vechicle v = new Car(2);
		v.drive3();
		//v.drive2();
		//v.drive1(); error
		
		//Car c2 = new Vechicle();  error
		//c2.drive1();
		v.tax2();
	}

	@Override
	protected void tax2() {
		// TODO Auto-generated method stub
		
	}
}
