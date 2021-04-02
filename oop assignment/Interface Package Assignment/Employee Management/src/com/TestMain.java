package com;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		Department d = new Department(1, "Finance");
		Department d1 = new Department(2, "Delivery");
		Employee emp = new Employee(1, "Ismaeel", 25000, d,"Asistance");
		Employee emp1 = new Employee(2, "Kaif", 15000,  d1,"Delivery");
		Employee emp2 = new Employee(3, "Rahul", 40000,  d,"Manager");
		Employee emp3 = new Employee(4, "Dheeraj", 25000,  d,"Book keepr");
		Employee emp4 = new Employee(4, "Sufiyaan", 22000,  d,"Book keepr");
		
		FinanceDepartment dept = new FinanceDepartment();
		dept.addEmployee(emp);
		dept.addEmployee(emp1);
		dept.addEmployee(emp2);
		dept.addEmployee(emp3);
		dept.addEmployee(emp4);
		
		List<Employee> allEmployeesOfFinanceDepartment = dept.getAllEmployeesOfFinanceDepartment();
		System.out.println("<======================List of all employees belonging to finance department=============================>");
		display(allEmployeesOfFinanceDepartment.toArray());
		
		Employee employee = dept.getEmployeeById(3);
		System.out.println("<======================Searched Employee Details=============================>");
		display(employee);
		
		double totalSalaryOfFinanceDepartment = dept.totalSalaryOfFinanceDepartment();

		System.out.println("\n Total salary of finance department :" + totalSalaryOfFinanceDepartment);
		
		double totalSalaryOfManagers = dept.totalSalaryOfManagers();
		
		System.out.println("Total salary of managers: " + totalSalaryOfManagers);
	}
	
	public static void display(Object... objects)
	{
		for(Object obj: objects)
		{
			Employee emp = (Employee)obj;
			System.out.println("Employee Id: " + emp.getEmpId());
			System.out.println("Employee Name: " + emp.getEmpName());
			System.out.println("Employee Deparment: " + emp.getDept().getDetName());
		}
	}

}
