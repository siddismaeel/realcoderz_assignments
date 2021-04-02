package com.customer;

import java.util.ArrayList;
import java.util.List;

import com.address.Address;

public class Customer {
	private int customerId;
	private String cutomerName;
	private List<Address> addresses = new ArrayList<>();
	
	public Customer(int customerId, String cutomerName) {
		super();
		this.customerId = customerId;
		this.cutomerName = cutomerName;
	}

	public void addAddress(Address address)
	{
		addresses.add(address);
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public String getCutomerName() {
		return cutomerName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}
	
	
	
}
