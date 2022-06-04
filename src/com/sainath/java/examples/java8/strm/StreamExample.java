package com.sainath.java.examples.java8.strm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Emp> list = getList();
		System.out.println(list);
		//list.forEach(i -> System.out.println(i));
		//list.stream().forEach(i -> System.out.println(i));
		Optional<List<Emp2>> list2 = getEmp2(list);
		if(list2.isPresent()) {
			list2.get();
		} else {
			
		}
		
		List<Emp2> list3 = getEmp2UsingStream(list);
		System.out.println(list2);
		System.out.println("list3: " + list3);
	}

	private static List<Emp2> getEmp2UsingStream(List<Emp> list) {
		List<Emp2> collect = list.stream()
					.filter(emp -> emp.getAge() > 30)
					.map(emp -> new Emp2(emp.getAge(), emp.getName(), emp.getId(), true))
					.distinct()
					.sorted((Emp2 e1, Emp2 e2) -> e1.getName().compareTo(e2.getName()))
					.collect(Collectors.toList())
					
					//Optional
					//flatMap
					//FindAny//FindFirst
					//anyMatch()
					//parellelStream()
					
					;
		return collect;
	}

	private static Optional<List<Emp2>> getEmp2(List<Emp> list) {
		List<Emp2> list2 = new ArrayList<Emp2>();
		for (Emp emp : list) {
			if(emp.getAge() > 30) {
				list2.add(new Emp2(emp.getAge(),
						emp.getName(), emp.getId(), true));
				
			}
		}
		return Optional.of(list2);
	}

	private static List<Emp> getList() {
		return Arrays.asList(
				
				new Emp(22, "X", 1),
				new Emp(32, "Y", 2),
				new Emp(42, "XD", 3),
				new Emp(26, "Xs", 4),
				new Emp(34, "XA", 5),
				new Emp(52, "XCC", 6),
				new Emp(54, "XCC", 6)
				
				);
	}
}

class Emp {
	int age;
	String name;
	int id;
	public Emp(int age, String name, int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	
	
}

class Emp2 {
	int age;
	String name;
	int id;
	boolean processed;
	
	public Emp2(int age, String name, int id, boolean processed) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.processed = processed;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Emp2 [age=" + age + ", name=" + name + ", id=" + id + ", processed=" + processed + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp2 other = (Emp2) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
}