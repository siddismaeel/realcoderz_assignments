package com.real;
class Address
{
	private String addressLine;
	private String city;
	
	public Address(String addressLine, String city)
	{
		this.addressLine = addressLine;
		this.city = city;
	}
	
	public String getAddressLine()
	{
		return this.addressLine;
	}
	public void setAddressLine(String addressLine)
	{
		this.addressLine = addressLine;
	}
	
	public String getCity()
	{
		return this.getCity();
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getAddressDetails()
	{
		return addressLine + ", " + city; 
	}
}