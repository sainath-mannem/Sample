package com.sainath.java.examples.threads;

public class EmployeeList {

	private int empCount;
	private int dept;
	
	private Object empDummy = new Object();
	private Object deptDummy = new Object();
	
	public void addEmp() {
		////////
		synchronized (empDummy) {
			empCount++;
		}
		/////
	}
	
	public void deleteEmp() {
		synchronized (empDummy) {
			empCount--;
		}
	}
	
	public void  addDept() {
		synchronized (deptDummy) {
			dept++;
		}
		
	}
	
	public void  deleteDept() {
		synchronized (deptDummy) {
			dept--;
		}
	}


	public int getEmpCount() {
		return empCount;
	}
	
}
