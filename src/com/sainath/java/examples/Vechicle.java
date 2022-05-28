package com.sainath.java.examples;

public abstract class Vechicle {

	private int wheels;
	
	public Vechicle(int wheels) {
		this.wheels = wheels;
	}
	public Vechicle() {
	}

	public void drive() {
		System.out.println("Vechile");
	}
	
	public void drive2() {
		System.out.println("drive2");
	}
	
	protected void drive3() {
		System.out.println("drive2");
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void getEmp() {
		tax();
	
	}

	protected void tax() {
		
	}
	
	abstract protected void tax2();
	
}
