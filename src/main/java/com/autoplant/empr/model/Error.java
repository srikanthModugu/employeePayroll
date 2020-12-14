package com.autoplant.empr.model;

public class Error {

	private String message;
	private int code;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Error(String message, int code) {
		super();
		this.message = message;
		this.code = code;
	}
	
	
}
