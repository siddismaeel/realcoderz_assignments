package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	private Department dept;
	private String grade;

	

	public Employee(int empId, String empName, double salary, Department dept, String grade) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
		this.grade = grade;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Department getDept() {
		return dept;
	}

	public double getSalary() {
		return salary;
	}

	public String getGrade() {
		return grade;
	}

	
}
