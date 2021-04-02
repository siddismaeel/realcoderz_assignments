package com.bank;

import java.util.ArrayList;
import java.util.List;

import com.address.Address;
import com.customer.Customer;

public class Bank {

	private List<Customer> customers = new ArrayList<>();
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	
	public List<Customer> getAllCustomers()
	{
		return this.customers;
	}
	
	
	public List<Customer> getAllCustomersByCity(String city)
	{
		List<Customer> customersByCity = new ArrayList<>();
		
		for(Customer customer: customers)
		{
			for(Address address: customer.getAddresses())
			{
				if(address.getCity().equalsIgnoreCase(city))
				{
					customersByCity.add(customer);
				}
			}
		}
		return customersByCity;
	}
	
	
}
