package com;

public class Toy {

	private String name;
	private String category;
	private double price;
	private double discount;
	public Toy(String name, String category, double price, double discount) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.discount = discount;
	}
	
	
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getDiscount()
	{
		return this.discount;
	}
	public void setDiscount(double discount)
	{
		this.discount = discount;
	}
	public String getName()
	{
		return this.name;
	}
	public String getCategory()
	{
		return this.category;
	}
	
	
	
}
