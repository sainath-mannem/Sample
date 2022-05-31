package com.sainath.java.examples.collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("sai");
		set.add("sai");
		set.add("Sai");
		set.add("Sai");
		set.add("Sai2");
		set.add("Sai1");
		
		System.out.println(set);
		Set<Employee> empset = new HashSet<>();
		Employee emp = new Employee(1, "Sainath");
		Employee emp2 = new Employee(1, "Sainath");
		Employee emp3 = new Employee(1, "Sainath");
		Employee emp4 = new Employee(1, "Sainath2");
		Employee emp5 = new Employee(2, "Sainath");
		
		empset.add(emp);
		empset.add(emp);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		
		System.out.println(empset);
	}
}

