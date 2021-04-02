package com.real;

public class TestCustomer {

	public static void main(String[] args) {
		
		Address residentialAddress = new Address("Village and Post Jarari", "Farrukhabad");
		Address officialAddress = new Address("Knowledge Park 3", "Noida");
		
		Customer customer = new Customer("Ismaeel", residentialAddress, officialAddress);
		
		System.out.println(customer.getCustomerDetails());

	}

}
