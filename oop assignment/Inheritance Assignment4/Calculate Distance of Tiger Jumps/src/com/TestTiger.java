package com;

public class TestTiger {

	public static void main(String[] args) {
		
		Animal animal = new Tiger();
		
		double distance = animal.jumping(300);
		
		System.out.println("Jumping distance of tiger: " + distance);

	}

}
