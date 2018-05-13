package com.sainath.java.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		Comparator<Employee> comp = (Employee emp1, Employee emp2) -> 
										emp1.getNumber().compareTo(emp2.getNumber());
		List<Employee> list = getEmpList();
		list.sort(comp);
		System.out.println(list);
	}

	private static List<Employee> getEmpList() {
		return Arrays.asList(
				new Employee(2, "Sainath2"),
				new Employee(1, "Sainath1"),
				new Employee(3, "Sainath3"),
				new Employee(5, "Sainath5")
				);
	}
}
