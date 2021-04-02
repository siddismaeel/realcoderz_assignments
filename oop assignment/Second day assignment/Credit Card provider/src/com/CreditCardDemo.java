package com;

public class CreditCardDemo {

	public static void main(String[] args) {
		
		CreditCardCompany company = new CreditCardCompany();
		
		Customer c1 = new Customer(1,1,2200);
		Customer c2 = new Customer(2,2,1800);
		Customer c3 = new Customer(3,3,1400);
		Customer c4 = new Customer(4,4,400);
		Customer c5 = new Customer(5,5,2800);
		
		System.out.println("Credit Card Charges for the customer: " + c1.getCustId() + company.getPaybackAmount(c1));
		System.out.println("Credit Card Charges for the customer: " + c2.getCustId() + company.getPaybackAmount(c2));
		System.out.println("Credit Card Charges for the customer: " + c3.getCustId() + company.getPaybackAmount(c3));
		System.out.println("Credit Card Charges for the customer: " + c4.getCustId() + company.getPaybackAmount(c4));
		System.out.println("Credit Card Charges for the customer: " + c5.getCustId() + company.getPaybackAmount(c5));
	}
	
	


	


}




