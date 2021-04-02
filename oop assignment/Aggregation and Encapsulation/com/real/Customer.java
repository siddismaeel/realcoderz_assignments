package com.real;
class Customer {
	private String customerName;
	private Address address;
	private Address officialAddress;

	public Customer() {

	}

	
	public Customer(String customerName, Address address, Address officialAddress) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.officialAddress = officialAddress;
	}


	public Customer(String name, Address address) {
		this.customerName = name;
		this.address = address;

	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String name) {
		this.customerName = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}

	public String getCustomerDetails()
	{
		
		return "Customer : " + customerName + "\n"
				+ "Residential Address : " + address.getAddressDetails() + "\n"
						+ "Official Address : " + officialAddress.getAddressDetails();
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", address=" + address + ", officialAddress="
				+ officialAddress + "]";
	}

	

}