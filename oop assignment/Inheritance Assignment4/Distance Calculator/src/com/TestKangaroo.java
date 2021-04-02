package com;

public class TestKangaroo {

	public static void main(String[] args) {
		
		Animal animal = new Kangaroo();
		
		double distance = animal.jumping(30.25);
		
		System.out.println("Kangaroo jumps: " + distance + " feet");

	}

}
