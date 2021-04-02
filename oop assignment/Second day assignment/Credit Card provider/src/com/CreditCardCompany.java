package com;

public class CreditCardCompany {

	public  double getPaybackAmount(Customer customer) {
		
		double charges = customer.getCreditCardCharges();
		double payBackAmount = 0.0;
		if(charges <= 500)
		{
			payBackAmount =  0.25 /100 * charges; 
		}
		else if(charges > 500 && charges <= 1500)
		{
			payBackAmount = charges * 0.50 /100; 
		}
		else if(charges > 1500 && charges <= 2500)
		{
			payBackAmount = charges * 0.75 /100; 
		}
		else
		{
			payBackAmount = charges * 1 /100; 
		}
		
		return payBackAmount;

	}
}
