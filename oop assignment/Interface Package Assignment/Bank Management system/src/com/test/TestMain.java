package com.test;

import java.util.List;

import com.address.Address;
import com.bank.Bank;
import com.customer.Customer;

public class TestMain {

	public static void main(String[] args) {
		
		Address addr1 = new Address(1, "Official", "Knowledge Park 3", "Noida");
		Address addr2 = new Address(2, "Residential", "Jarari", "Farrukhabad");
		Customer cust = new Customer(1,"Ismaeel");
		cust.addAddress(addr1);
		cust.addAddress(addr2);
		
		Address addr3 = new Address(2, "Official", "Rajiv Chowk", "Gurugram");
		Address addr4 = new Address(3, "Residential", "Jarari", "Farrukhabad");
		Customer cust1 = new Customer(2,"Farman");
		cust1.addAddress(addr3);
		cust1.addAddress(addr4);
		
		Address addr5 = new Address(2, "Official", "Sector 62", "Noida");
		Address addr6 = new Address(3, "Residential", "Bever", "Mainpuri");
		Customer cust2 = new Customer(2,"Rahul");
		cust2.addAddress(addr5);
		cust2.addAddress(addr6);
		
		Bank bank = new Bank();
		bank.addCustomer(cust);
		bank.addCustomer(cust1);
		bank.addCustomer(cust2);
		
		List<Customer> allCustomers = bank.getAllCustomers();
		System.out.println("All Customer Details:");
		display(allCustomers);
		
		List<Customer> allCustomersByCity = bank.getAllCustomersByCity("Noida");
		System.out.println("<=======================================================>");
		System.out.println("Customer Details By City:");
		display(allCustomersByCity);
		
	}
	
	public static void display(List<Customer> customers)
	{
		for(Customer customer: customers)
		{
			System.out.println("Customer Id: " + customer.getCustomerId());
			System.out.println("Customer Name: " + customer.getCutomerName());
			
			for(Address address: customer.getAddresses())
			{
				System.out.println(address);
			}
		}
	}

}
