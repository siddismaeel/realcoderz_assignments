package com.test;

import com.shape.Polygon;
import com.shape.Rectangle;
import com.shape.Square;

public class Test {

	public static void main(String[] args) {
		
		Polygon poly1 = new Square(2.5f);
		Polygon poly2 = new Rectangle(4.8f, 2.5f);
		
		System.out.println("Area of Rectangle: " + poly1.calcArea());
		System.out.println("perimeter of Rectangle: " + poly1.calcPeri());
		
		System.out.println("Area of Square: " + poly2.calcArea());
		System.out.println("perimeter of Square: " + poly2.calcPeri());

	}

}
