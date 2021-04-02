package com.real;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Medicine {

	private double price;
	private Date expiryDate;
	
	public abstract void displayLabel();
	public void getDetails()
	{
		System.out.println("Price : " + price);
		System.out.println("Expiry Date : " + new SimpleDateFormat("dd MMM yyyy").format(expiryDate.getTime()));
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
