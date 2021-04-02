package com.real;

import java.util.Scanner;

import com.real.api.Address;
import com.real.api.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		EmployeeDemo demo = new EmployeeDemo();
		
		demo.storeData(emp);
		demo.showData(emp);

	}

	public void storeData(Employee emp)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the employee id");
		String id = sc.next();
		
		System.out.println("Enter the employee name");
		String empName = sc.next();
		
		System.out.println("Enter the employee address1");
		String address1 = sc.next();
		
		System.out.println("Enter the employee address2");
		String address2 = sc.next();
		
		System.out.println("Enter the employee city");
		String city = sc.next();
		
		System.out.println("Enter the pin ");
		String pin = sc.next();
		
		
		Address address = new Address();
		address.setAddress1(address1);
		address.setAddress2(address2);
		address.setCity(city);
		address.setPin(pin);
		
		emp.setAddress(address);
		emp.setEmpName(empName);
		emp.setEmpID(id);
		
		sc.close();
		
	}
	
	public void showData(Employee emp)
	{
		System.out.println("Employee ID : " + emp.getEmpID());
		System.out.println("Employee Name : " + emp.getEmpName());
		System.out.println("Employee First Address : " + emp.getAddress().getAddress1());
		System.out.println("Employee Second Address : " + emp.getAddress().getAddress2());
		System.out.println("Employee City : " + emp.getAddress().getCity());
		System.out.println("Employee Pin : " + emp.getAddress().getPin());
	}
	
}
