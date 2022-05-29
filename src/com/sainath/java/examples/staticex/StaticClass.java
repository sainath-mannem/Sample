package com.sainath.java.examples.staticex;

public class StaticClass {

	public static int X;
	public static String S;
	
	static {
		X = 10;
	}
	
	public static void test() {
		X= 12;
	}
}
