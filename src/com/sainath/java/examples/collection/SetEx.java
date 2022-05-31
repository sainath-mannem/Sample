package com.sainath.java.examples.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		
		set.add("sai");
		set.add("sai");
		set.add("Sai");
		set.add("Sai");
		set.add("Sai2");
		set.add("Sai1");
		set.add("X");
		set.add("Z");
		set.add("D");
		set.add("A");
		set.add("G");
		set.add("S");
		
		System.out.println(set);
		Set<Employee> empset = new TreeSet<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		Employee emp = new Employee(1, "Sainath");
		Employee emp2 = new Employee(1, "Sainath");
		Employee emp3 = new Employee(1, "Sainath");
		Employee emp4 = new Employee(1, "Sainath2");
		Employee emp5 = new Employee(2, "Sainath");
		Employee emp6 = new Employee(3, "Sainath");
		Employee emp7 = new Employee(4, "Sainath");
		
		empset.add(emp5);
		empset.add(emp6);
		empset.add(emp7);
		empset.add(emp);
		empset.add(emp);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		empset.add(emp6);
		empset.add(emp7);
		
		System.out.println(empset);
	}
}

