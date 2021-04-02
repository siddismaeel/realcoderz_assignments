package com.realcoderz.shapes;

public class Circle {

	private float radius ;
	float pi = 3.5f;
	
	public Circle() {
		
		this.radius = 1.5f;
	}

	protected Circle(float radius) {
		this(radius, 3.5f);
		
	}

	private Circle(float radius, float   pi ) {
		super();
		this.radius = radius;
		this.pi = pi;
	}
	
	
	
	
}
