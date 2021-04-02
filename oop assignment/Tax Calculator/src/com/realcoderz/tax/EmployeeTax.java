package com.realcoderz.tax;

public class EmployeeTax {

	public static void main(String[] args) {
		
		TaxCalculator calc = new TaxCalculator();
		calc.basicSalary = 125000.00f;
		calc.citizenship = true;
		
		calc.calculateTax();
		calc.deductTax();
		calc.validateSalary();
	}
}
