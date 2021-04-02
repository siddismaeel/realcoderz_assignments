package com.real;

public class Ointment extends Medicine {

	@Override
	public void displayLabel() {
		getDetails();
		System.out.println("for external use only");

	}

}
