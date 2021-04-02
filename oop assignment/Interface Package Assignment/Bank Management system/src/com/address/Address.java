package com.address;

public class Address {
	
	private int addrId;
	private String addressType;
	private String addressLine;
	private String city;
	
	public Address() {}
	public Address(int addrId, String addressType, String addressLine, String city) {
		super();
		this.addrId = addrId;
		this.addressType = addressType;
		this.addressLine = addressLine;
		this.city = city;
	}
	
	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return addressType + "\n \t" + addressLine + ", " + city;
	}
	
	

}
