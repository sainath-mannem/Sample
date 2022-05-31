package com.sainath.java.examples.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		List<Emp> empList = getEmps();
		Map<Depart, List<Emp>> deptEmpListMap = new HashMap<>();
		//Map<Integer, List<Emp>> deptEmpListMap = new HashMap<>();
		/*for (Emp emp : empList) {
			int deptno = emp.getDeptNo();
			if(deptEmpListMap.get(deptno) != null) {
				List<Emp> list = deptEmpListMap.get(deptno);
				list.add(emp);
			} else {
				List<Emp> list = new ArrayList<>();
				list.add(emp);
				deptEmpListMap.put(deptno, list);
			}
		}
		
		Set<Integer> keys = deptEmpListMap.keySet();
		
		for (Integer deptNo : keys) {
			System.out.println("Dept No: "+ deptNo);
			System.out.println("Emps in Dept"+ deptEmpListMap.get(deptNo));
			System.out.println("***********************************");
		}*/
		
		for (Emp emp : empList) {
			Depart dept = emp.getDepat();
			if (deptEmpListMap.get(dept) != null) {
				List<Emp> list = deptEmpListMap.get(dept);
				list.add(emp);
			} else {
				List<Emp> list = new ArrayList<>();
				list.add(emp);
				deptEmpListMap.put(dept, list);
			}
		}

		Set<Depart> keys = deptEmpListMap.keySet();

		for (Depart deptNo : keys) {
			System.out.println("Dept No: " + deptNo);
			System.out.println("Emps in Dept" + deptEmpListMap.get(deptNo));
			System.out.println("***********************************");
		}
		System.out.println("Old Value: " + deptEmpListMap.put(new Depart(10, "IT"), null));
		System.out.println("+++++++++++++++++++++++++++++++++");
		for (Depart deptNo : keys) {
			System.out.println("Dept No: " + deptNo);
			System.out.println("Emps in Dept" + deptEmpListMap.get(deptNo));
			System.out.println("***********************************");
		}
		
	}

	private static List<Emp> getEmps() {
		Depart d = new Depart(10, "IT");
		Depart d2 = new Depart(11, "Fin");
		/*return Arrays.asList(new Emp(1, "X", d),
								new Emp(2, "Y", d),//d.equals(d)
								new Emp(3, "Z", d2),
								new Emp(4, "A", d2)
				);*/
		/*return Arrays.asList(new Emp(1, "X", 1),
				new Emp(2, "Y", 2),
				new Emp(3, "Z", 1),
				new Emp(4, "A", 2));*/
		return Arrays.asList(new Emp(1, "X", new Depart(10, "IT")),
				new Emp(2, "Y", new Depart(10, "IT")),
				new Emp(3, "Z", new Depart(11, "Fin")),
				new Emp(4, "A", new Depart(11, "Fin"))
);
	}
	
	
}

class Emp {
	int id;
	String name;
	Depart depat;
	int deptNo;
	public Emp(int id, String name, Depart depat) {
		super();
		this.id = id;
		this.name = name;
		this.depat = depat;
	}
	public Emp(int id, String name, int deptNo) {
		super();
		this.id = id;
		this.name = name;
		this.deptNo = deptNo;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Depart getDepat() {
		return depat;
	}
	public int getDeptNo() {
		return deptNo;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", depat=" + depat + ", deptNo=" + deptNo + "]";
	}
	
	
}

class Depart {
	int id;
	String name;
	public Depart(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Depart [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depart other = (Depart) obj;
		return id == other.id;
	}
	
	
}
