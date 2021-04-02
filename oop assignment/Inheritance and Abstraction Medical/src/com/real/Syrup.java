package com.real;

public class Syrup extends Medicine {

	@Override
	public void displayLabel() {
		getDetails();
		System.out.println("Shake well before use");

	}

}
