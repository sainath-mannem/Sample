package com.sainath.java.examples;

public class Employee {

	public int number;
	private String name;
	protected String name2;
	String name3;
	public static String xxx = "Y";
	
	public Employee() {
	}
	
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
		mm2();
		this.name = name;
	}
	@Override
	public String toString() {
		
		
		
		return "Employee [number=" + number + ", name=" + name + "]";
		
		
	}
	
	public static void mm() {
		mm2();
	}
	
	public static void mm2() {
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "x";
		String x = e.name;
		Employee e2 = new Employee(1,"Sai");
		Employee e100 = new Employee(2,"Sainath");
		
		System.out.println(e.name);
		System.out.println(e2.name);
		System.out.println(e100.name);
		
		DefaultClass dt = new DefaultClass();
		
		String xww =  Employee.xxx;
		e.xxx = "Z";
		e2.xxx = "CC";
		System.out.println(Employee.xxx);
		System.out.println(e.xxx);
		System.out.println(e2.xxx);
	}
	
	
}
