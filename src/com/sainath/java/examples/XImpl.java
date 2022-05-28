package com.sainath.java.examples;

public class XImpl implements X {

	@Override
	public void method1() {
		System.out.println("method1");
	}
	
	public void method2() {
		//int y = X.x;
		int y2 = x;
		System.out.println("method2");
	}
	
	public static void main(String[] args) {
		X x = new XImpl();
		x.method1();
		//x.method2(); error
	}
	
	void xxxx(X x) {
		
	}

}
