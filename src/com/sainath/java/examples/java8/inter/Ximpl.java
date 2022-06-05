package com.sainath.java.examples.java8.inter;

public class Ximpl implements X, X2 {
	
	int x;
	
	int y;

	@Override
	public void setXValue(int x) {
		this.x = x;
	}

	@Override
	public void setYValue(int y) {
		this.y = y;
	}
	
	
	@Override
	public int addValues(int x, int y) {
		return x-y;
	}

	public static void main(String[] args) {
		X x = new Ximpl();
		x.setXValue(20);
		x.setYValue(30);
		
		System.out.println(x.addValues(30, 40));
		System.out.println(X.maxValue(30, 40));
	}

}
