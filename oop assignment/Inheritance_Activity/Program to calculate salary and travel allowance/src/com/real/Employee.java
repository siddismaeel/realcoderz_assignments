package com.real;

public class Employee {

	 long empoyeeId;
	 String employeeName;
	 String employeeAddress;
	 long employeePhone;
	 double basicSalary;
	 double specialAllowance = 250.80;
	 double hra = 1000.50;
	
	public Employee(long id, String name, String address, long phone) {
		super();
		this.empoyeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	
	public double calculateSalary()
	{
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100 );
		System.out.println("Salary: " + salary);
		return salary;
	}
	
	public double calculateTransportAllowance()
	{
		double transportAllowance = 10/100*basicSalary;
		basicSalary += transportAllowance;
		System.out.println("Salary: " + basicSalary);
		return transportAllowance;
	}
	
	
}
