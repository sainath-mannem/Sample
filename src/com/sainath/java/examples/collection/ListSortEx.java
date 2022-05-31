package com.sainath.java.examples.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ListSortEx {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(40);
		intList.add(10);
		intList.add(5);
		System.out.println("Before List: "+ intList);
		intList.sort(null);
		System.out.println("After Sort: "+ intList);
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "Sai"));
		empList.add(new Employee(3, "Syam"));
		empList.add(new Employee(5, "Sai2"));
		empList.add(new Employee(2, "Syam2"));
		
		System.out.println("Before emp List: "+ empList);
		//empList.sort(null);
		Collections.sort(empList);
		System.out.println("After Sort emp: "+ empList);
		
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		
		System.out.println("After Sort empByName: "+ empList);
	}
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.id < o.getId() ? 1 : -1;
	}
	
}

class EmpComparatorByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o1.getName());
	}
	
}

