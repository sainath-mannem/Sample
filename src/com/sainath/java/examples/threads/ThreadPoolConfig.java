package com.sainath.java.examples.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolConfig {
	
	private static ExecutorService executorService = Executors.newCachedThreadPool();
	
	public static ExecutorService getThreadPool() {
		return executorService;
	}
}
