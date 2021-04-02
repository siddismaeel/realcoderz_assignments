package com;

public class TestCircle {

	public static void main(String[] args) {

		Shap shap = new Circle();
		double area = shap.getArea(10);
		
		System.out.println("Circle area is: "+ area);

	}

}
