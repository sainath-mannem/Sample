package com.sainath.java.examples.exception;

public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1049449169881769762L;
	
	private int errorCode;
	private String message;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ApplicationException(int errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}

}
