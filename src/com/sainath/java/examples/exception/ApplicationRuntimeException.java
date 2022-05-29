package com.sainath.java.examples.exception;

@SuppressWarnings("serial")
public class ApplicationRuntimeException extends RuntimeException {

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
	public ApplicationRuntimeException(int errorCode, String message) {
		this.errorCode = errorCode;
		this.message = message;
	}

}
