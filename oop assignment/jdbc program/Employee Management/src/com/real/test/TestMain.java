package com.real.test;

import java.util.Scanner;

import com.real.exception.LowSalException;
import com.real.model.Employee;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = null;

		int choice = 1;
		while (choice != 0) {
			System.out.println("Enter your choice as following : " + "\n 1: For inserint the new record"
					+ "\n 2: For retriving the data" + "\n 3: To get employee with highest salary" + "\n 0: For exit");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				try {
					emp = new Employee();
					emp.acceptInput();
				} catch (LowSalException e) {

					e.printStackTrace();
				}
				emp.calculateHra();
				emp.storeDatabase();
				break;

			case 2:
				System.out.println("Enter the id to get employee record");
				int id = sc.nextInt();
				emp = new Employee();
				emp.retriveFromDatabase(id);
				if (emp.getEmpId() != 0) {
					display(emp);
				} else {
					System.out.println("Could not find the data based on the id: " + id);
				}
				break;
			case 3:

				System.out.println(Employee.employeeNameWithHighestSalary());

				break;
			case 0:
				System.out.println("Terminated....");
				System.exit(0);
			default:
				System.out.println("Wrong choice!");

			}

		}

	}

	public static void display(Employee emp) {
		System.out.println("Employee Id: " + emp.getEmpId());
		System.out.println("Employee Name: " + emp.getEmoName());
		System.out.println("Employee Designation: " + emp.getDesignation());
		System.out.println("Employee Salary: " + emp.getBasic());
		System.out.println("Employee HRA: " + emp.getHra());
		System.out.println("Employee Nett Salary: " + (emp.getBasic() + emp.getHra()));
	}

}
