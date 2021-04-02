package com.real.exception;

public class LowSalException extends Exception {

	double salary;
	String message;

	public LowSalException(double salary, String message) {
		super();
		this.salary = salary;
		this.message = message;
	}

	@Override
	public String getMessage() {

		return message + salary;
	}

}
