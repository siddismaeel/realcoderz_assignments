package com.realcoderz.tax;

public class TaxCalculator {

	float basicSalary;
	int nettSalary;
	float tax;
	boolean citizenship;
	
	public void calculateTax()
	{
		//30*basic salary/100
		tax = 30 * basicSalary / 100;
		
		System.out.println("The Tax of the employee  for  the "+basicSalary+ " is " +tax );
	}
	
	public void deductTax()
	{
		nettSalary = (int) (basicSalary - tax);
		
		System.out.println("The nett salary of the employee " + nettSalary);
	}
	
	public void validateSalary()
	{
		if(basicSalary > 100000 && citizenship)
		{
			System.out.println("The salary and citizenship eligibility:  " + citizenship);
		}
		else
		{
			System.out.println("The salary and citizenship eligibility:  " + citizenship);
		}
	}
	
	
}
