package com.sainath.java.examples.threads;

import java.util.ArrayList;
import java.util.List;

import com.sainath.java.examples.Employee;

public class ThreadByRunnableEx {
	private EmployeeList empList = new EmployeeList();
	public static void main(String[] args) {
		ThreadByRunnableEx ex = new ThreadByRunnableEx();
		List<Employee> emps = getEmps();
		long longmills = System.currentTimeMillis();
		// processEmpInSeq(emps);
		ex.processEmpInParallel(emps);
		System.out.println("Time taken to process the job " + (System.currentTimeMillis() - longmills));
		System.out.println(ex.empList.getEmpCount());
	}

	private void processEmpInParallel(List<Employee> emps) {
		List<Thread> threads = new ArrayList<>();
		for (Employee employee : emps) {
			Thread mainThread = new Thread(new MainRunnable(employee, empList));
			mainThread.start();
			threads.add(mainThread);
		}
		for (Thread mainThread : threads) {
			try {
				mainThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void processEmpInSeq(List<Employee> emps) {
		for (Employee employee : emps) {
			new MainThread(employee).run();
		}
	}

	private static List<Employee> getEmps() {
		List<Employee> emps = new ArrayList<Employee>();
		for (int i = 1; i <= 100; i++) {
			emps.add(new Employee(i, "Emp " + i));
		}
		return emps;
	}

}

class MainRunnable implements Runnable {
	private Employee emp;
	private EmployeeList empList;
	MainRunnable(Employee emp, EmployeeList empList) {
		this.emp = emp;
		this.empList = empList;
	}
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp + " is running in a thread");
		empList.addEmp();
		empList.deleteEmp();
	}
}