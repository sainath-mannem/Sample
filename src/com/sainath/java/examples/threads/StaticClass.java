package com.sainath.java.examples.threads;

public class StaticClass {

	
	public synchronized static void m1() {
		///
	}
	
	public synchronized static void m2() {
		///
	}
	
	public static void m3() {
		///
		synchronized(StaticClass.class) {
			
		}
	}
}
