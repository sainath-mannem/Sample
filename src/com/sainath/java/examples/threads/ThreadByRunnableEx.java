package com.sainath.java.examples.threads;

import java.util.ArrayList;
import java.util.List;

import com.sainath.java.examples.Employee;

public class ThreadByRunnableEx {
  public static void main(String[] args) {
	List<Employee> emps = getEmps();
	long longmills = System.currentTimeMillis();
	//processEmpInSeq(emps);
	processEmpInParallel(emps);
	System.out.println("Time taken to process the job "+(System.currentTimeMillis() - longmills));
  }

	private static void processEmpInParallel(List<Employee> emps) {
		List<Thread> threads = new ArrayList<>();
		for (Employee employee : emps) {
			Thread mainThread = new Thread(new MainRunnable(employee));
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
		for (int i = 1; i <= 1000; i++) {
			emps.add(new Employee(i, "Emp " + i));
		}
		return emps;
	}

}

class MainRunnable implements Runnable {
	private Employee emp;
	MainRunnable(Employee emp) {
		this.emp = emp;
	}
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp + " is running in a thread");
	}
}