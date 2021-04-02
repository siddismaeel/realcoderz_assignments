package com.test;

import com.real.Department;
import com.real.Employee;
import com.real.EmployeeUploader;

import oracle.net.TNSAddress.Address;

public class TestMain {

	public static void main(String[] args) {

		
		Department d1 = new Department(1, "Accounts", "Ramesh", "Account Dept");
		Department d2 = new Department(2, "Admin", "Vijay", "Admin Dept");
		Department d3 = new Department(3, "Sales", "Vinod", "Sales Dept");
		Department d4 = new Department(4, "HR", "Mahesh", "HR Dept");

		/*
		 * EmployeeUploader.storeDepartmentDetails(d1);
		 * EmployeeUploader.storeDepartmentDetails(d2);
		 * EmployeeUploader.storeDepartmentDetails(d3);
		 * EmployeeUploader.storeDepartmentDetails(d4);
		 */
		Employee emp1 = new Employee("087", "Vikram", "Address 1", 12000, 9878761212l, null);
		Employee emp2 = new Employee("110", "Ajay", "Address 2", 18000, 9654376143l, null);
		Employee emp3 = new Employee("098", "Rajesh", "Address 3", 11000, 9965322212l, null);
		Employee emp4 = new Employee("067", "Ram", "Address 4", 19000, 8078343732l, null);
		Employee emp5 = new Employee("045", "Vimal", "Address 5", 27000, 8078343732l, null);
		Employee emp6 = new Employee("987", "Kiran", "Address 6", 21000, 7076337238l, null);
		//EmployeeUploader.storeEmployeeDetails(emp1, "Admin");
		//EmployeeUploader.storeEmployeeDetails(emp2, "Accounts");
		//EmployeeUploader.storeEmployeeDetails(emp3, "HR");
		//EmployeeUploader.storeEmployeeDetails(emp4, "Sales");
		//EmployeeUploader.storeEmployeeDetails(emp5, "HR");
		//EmployeeUploader.storeEmployeeDetails(emp6, "Admin");
		
		
		Employee emp = EmployeeUploader.retrieveEmployeeDetails(87);
		display(emp);
		
		System.out.println("PF Amount of id 087 is: " + EmployeeUploader.calculatePF(87));
		
		//Exceptions
		Employee emp7 = new Employee("087", "Kiran", "Address 6", 21000, 7076337238l, null);
		EmployeeUploader.storeEmployeeDetails(emp7, "Accounts");
		
		//storing department which does not exist
		EmployeeUploader.storeEmployeeDetails(emp7, "CA");
		
		//storing employee details having salary < 1000
		Employee emp8 = new Employee("124", "Jim", "Address 6", 500, 923234651, null);
		EmployeeUploader.storeEmployeeDetails(emp7, "Admin");


	}

	static void display(Employee emp) {
		if (emp == null) {
			System.out.println("No Data");
			return;
		}

		System.out.println("Employee Id: " + emp.getEmployeeId());
		System.out.println("Employee Name: " + emp.getEmployeeName());
		System.out.println("Employee Address: " + emp.getAddress());
		System.out.println("Salary: " + emp.getSalary());

		Department dept = emp.getDepartmnet();
		if (dept != null) {
			System.out.println("\t Department ID: " + dept.getDepartmentId());
			System.out.println("Department Name: " + dept.getDepartmentName());
			System.out.println("Department Head: " + dept.getDepartmentHead());
			System.out.println("Department Description: " + dept.getDepartmentDescription());
		}
	}

}
