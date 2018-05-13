package com.sainath.java.examples;

public class Employee {

	private int number;
	private String name;
	
	public Employee(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + "]";
	}
	
	
}
