package com;

public class TestRectangle {

	public static void main(String[] args) {
		
		Shap shap = new Rectangle();
		
		double area = shap.getArea(10, 20);
		
		System.out.println("Area of rectangle: " + area);

	}

}
