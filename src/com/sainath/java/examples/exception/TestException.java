package com.sainath.java.examples.exception;

public class TestException {

	public void initiateTrasfer() {
		try {
			new ExceptionHandling().fundtransfer("12", "34", 90);
			System.out.println("Suceess");
		} catch (NoFundsExcepion e) {
			System.out.println(e.getMessage());
		} catch (InvaildAccountExc e) {
			System.out.println(e.getMessage());
		} catch (ApplicationRuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		TestException ex = new TestException();
		ex.initiateTrasfer();
	}
}
