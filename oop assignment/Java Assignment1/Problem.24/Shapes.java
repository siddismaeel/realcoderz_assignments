
package com.realcoderz.shapes;
class Circle
{
	public void calculateArea(int radius)
	{
		System.out.println("The Area of the Circle is " + 3.14 *radius * radius);

	}
}
class Triangle
{
	public void calculateArea(int side)
	{
		System.out.println("The Area of the Circle is " + 0.433 *side * side);

	}
}
class Square
{
	public void calculateArea(int side)
	{
		System.out.println("The Area of the Circle is " + side * side);
	}
}

public class Shapes
{
	int numberOfSides;
	
	public void calculateShapeArea(int shape, int sideLength)
	{
		numberOfSides = shape;
		
		if(numberOfSides == 1)
		{
			// for circle
			Circle c = new Circle();
			c.calculateArea(sideLength);
		}
		else if(numberOfSides == 3)
		{
			//for triangle
			new Triangle().calculateArea(sideLength);
		}
		else if(numberOfSides == 4)
		{
			// for square
			new Square().calculateArea(sideLength);
		}
		else
		{
			System.out.println("No Shapes Present");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Shapes shape = new Shapes();
		shape.calculateShapeArea(3,12);
		shape.calculateShapeArea(4,15);
		shape.calculateShapeArea(5,15);
	}
	
}