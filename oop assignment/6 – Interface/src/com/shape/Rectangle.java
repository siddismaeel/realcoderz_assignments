package com.shape;

public class Rectangle implements Polygon{

	float length;		
	float breadth;	
	
	
	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float calcArea() {
		
		return length * breadth;
	}

	@Override
	public float calcPeri() {
		
		return 2 * (length + breadth);
	}

}
