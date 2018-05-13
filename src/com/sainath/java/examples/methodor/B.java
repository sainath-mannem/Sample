package com.sainath.java.examples.methodor;

import java.io.IOException;

interface I {
	void i1();
}


class A {

	protected Number getNumber(String number) throws IOException {
		return Integer.parseInt(number);
	}
	
	public void methodInA() {
		System.out.println("methodInA");
	}
	
	private void methodPrivate() {
		System.out.println("methodPrivate");
	}
}

public class B extends A implements I {

	@Override
	// overriden method visibility should be same or more
	//sub class object can be type casted to super class, so overriden method can have
	// return type i.e. sub class type of super class method
	
	// Overriden method can throw same exception or sub class of the super class exception
	public Long getNumber(String number) throws IOException {
		System.out.println("In B");
		return Long.parseLong(number);
	}
	
	public void methodInB() {
		System.out.println("methodInB");
	}

	@Override
	public void i1() {
		System.out.println("i1");
	}
	public static void main(String[] args) {
		
		I i = new B();
		i.i1();//using interface ref, we can call all methods part of that interface
		
		A a = new B();//this correct
		//System.out.println(a.getNumber("10"));
		//B b = new A(); //Sub class object cannot refer to super class obj
		//a.methodInB(); // wrong, super class ref knows about its own methods and
							// overriden methods
		a.methodInA(); //you can call all public/protected super class methods
		try {
			Number l = a.getNumber("10");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*Number n = new Number() {
			
			@Override
			public long longValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int intValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public float floatValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double doubleValue() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
		Long l = new Long(100);
		
		System.out.println(l);
		
		
		Number n1 = (Number) l;
		System.out.println(n1);*/
		
	}
}
