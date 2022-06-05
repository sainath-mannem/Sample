package com.sainath.java.examples.java8.inter;

public interface X2 {

	void setXValue(int x);
	
	void setYValue(int y);
	
	default int addValues(int x, int y) {
		return x-y;
	}
	
	public static int maxValue(int x, int y) {
		return x > y ? x : y;
	}
}
