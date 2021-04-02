package com.shape;

public class Square implements Polygon {

	 	float side;
	
	public Square(float side) {
			super();
			this.side = side;
		}

	@Override
	public float calcArea() {
		
		return side * side;

	}

	@Override
	public float calcPeri() {
		
		return side * 4;

	}

}
