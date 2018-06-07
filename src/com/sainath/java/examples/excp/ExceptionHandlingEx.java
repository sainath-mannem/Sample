package com.sainath.java.examples.excp;


class Util{
	
	public static int division(int param1, int param2) throws MyRuntimeException {
		int remainder;
		try {
			remainder = param1/param2;
			//call
			return remainder;
		} catch (MyRuntimeException e) {
			throw e;
		}
	}
	
	public static int division1(int param1, int param2) throws MyException {
		int remainder;
		try {
			remainder = param1/param2;
			/*if(false)
				throw new MyException();*/
			return remainder;
		} catch (Exception e) {
			//System.out.println("exception");
			//throw e;
			throw new MyException();
		}
		//return 0;
	} 
	
}

class MyException extends Exception {
	
}

class MyRuntimeException extends RuntimeException {
	
}

public class ExceptionHandlingEx {

	public static void main1() throws Exception {
		System.out.println(Util.division1(4, 0));
		//Util.division1(4, 0);
	}
	
	public static void main(String[] args) {
		try {
			main1();
		} catch (Exception e) {
			System.out.println("Exception handled");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
	}
}
