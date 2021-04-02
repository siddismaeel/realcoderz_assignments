package com.real;

public class Manager extends Employee{

	

	public Manager(long id, String name, String address, long phone, double salary)
	{
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	
	public double calculateTransportAllowance()
	{
		double transportAllowance = 15*basicSalary/100;
		basicSalary += transportAllowance;
		
		return transportAllowance;
	}

}
