package com.real;

public class Employee {

	private String employeeId;
	private String employeeName;
	private String address;
	private double salary;
	private long contac;
	private Department departmnet;
	public Employee(String employeeId, String employeeName, String address, double salary, long contac,
			Department departmnet) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.salary = salary;
		this.contac = contac;
		this.departmnet = departmnet;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getAddress() {
		return address;
	}
	public double getSalary() {
		return salary;
	}
	public long getContac() {
		return contac;
	}
	public Department getDepartmnet() {
		return departmnet;
	}
	
	
	
	
	
	
}
