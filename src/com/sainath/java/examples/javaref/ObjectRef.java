package com.sainath.java.examples.javaref;

import java.util.Calendar;

import com.sainath.java.examples.generics.Employee;

public class ObjectRef {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp3 = updateEmp(emp);
		System.out.println(emp.getName());
		System.out.println(emp3.getName());
		
		updateEmp2(emp);
		//System.out.println(emp.getName());
		final Calendar cal = Calendar.getInstance();
		cal.set(2021, 11, 11);
		cal.set(2021, 11, 11);
		call(cal);
		final String s = "";
	}

	private static void call(Calendar cal) {
		Calendar cal2 = cal;
		cal2.add(Calendar.MONTH, 11);
		
	}

	private static Employee updateEmp(Employee emp) {
		Employee emp2 = new Employee();
		emp2.setName("Sainath");
		emp = emp2;
		//System.out.println(emp.getName());
		return emp;
	}
	
	private static void updateEmp2(Employee emp) {
		emp.setName("Sainath");
	}
	
}
