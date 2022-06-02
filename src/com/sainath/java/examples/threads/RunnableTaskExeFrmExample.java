package com.sainath.java.examples.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.sainath.java.examples.Employee;

public class RunnableTaskExeFrmExample {
	
	private static EmployeeList empList = new EmployeeList();

	public static void main(String[] args) {
		List<Employee> emps = getEmps();
		//ExecutorService executorService = Executors.newFixedThreadPool(1000);
		ExecutorService executorService = Executors.newCachedThreadPool();
		long longmills  = System.currentTimeMillis();;
		try {
			List<Future<?>> threads = new ArrayList<>();
			for (Employee employee : emps) {
				 Future<?> f = executorService.submit(new MainRunnable(employee, empList));
				 threads.add(f);
			}
			for (Future<?> future : threads) {
				try {
					future.get();
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			executorService.shutdown();
		}
		System.out.println("Time taken to process the job " + (System.currentTimeMillis() - longmills));
		
	}
	
	private static List<Employee> getEmps() {
		List<Employee> emps = new ArrayList<Employee>();
		for (int i = 1; i <= 10000; i++) {
			emps.add(new Employee(i, "Emp " + i));
		}
		return emps;
	}
}


