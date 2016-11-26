package com.igiewear.utils;

public class CustomHttpResponseBody {
	
	private String message;
	private String error;
	
	public CustomHttpResponseBody(){
		
	}
	
	public CustomHttpResponseBody(String message) {
		this.message = message;
	}
	
	public CustomHttpResponseBody(String message, String error) {
		this.message = message;
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
