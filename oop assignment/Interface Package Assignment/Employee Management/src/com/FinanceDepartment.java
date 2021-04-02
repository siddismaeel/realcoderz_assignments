package com;

import java.util.ArrayList;
import java.util.List;

public class FinanceDepartment {

	private List<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee emp)
	{
		employees.add(emp);
	}
	
	List<Employee> getAllEmployees()
	{
		return this.employees;
	}
	
	List<Employee> getAllEmployeesOfFinanceDepartment()
	{
		List<Employee> financeEmps= new ArrayList<>();

		for (Employee employee : employees) {
			if (employee.getDept().getDetName().equalsIgnoreCase("Finance")) {
				
				financeEmps.add(employee);
			}
		}
		
		return financeEmps;
	}
	
	Employee getEmployeeById(int id)
	{
		Employee emp = null;
		
		for(Employee employee: employees)
		{
			if(employee.getEmpId() == id)
			{
				emp = employee;
				break;
			}
		}
		return emp;
	}
	
	public double totalSalaryOfFinanceDepartment()
	{
		double totalSalary = 0.0;

		for(Employee employee: employees)
		{
			if(employee.getDept().getDetName().equalsIgnoreCase("Finance"))
			{
				totalSalary += employee.getSalary();
			}
		}
		return totalSalary;
	}
	
	public double totalSalaryOfManagers()
	{
		double totalSalary = 0.0;

		for(Employee employee: employees)
		{
			if(employee.getGrade().equalsIgnoreCase("Manager"))
			{
				totalSalary += employee.getSalary();
			}
		}
		return totalSalary;
	}
}
