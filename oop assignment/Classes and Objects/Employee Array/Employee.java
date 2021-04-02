class Employee
{

	private int empNo;
	private String name;
	private String department;
	private double salary;

	public Employee(int empNo, String name, String department, double salary)
	{
		this.name = name;
		this.empNo = empNo;
		this.department = department;
		this.salary = salary;
	}
	public Employee(){}
	
	public int getEmpNo()
	{
		return this.empNo;
	}
	public void setEmpNo(int empNo)
	{
		this.empNo = empNo;
	}
	public String getName()
	{
		return this.name;
		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDepartment()
	{
		return this.department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public static Employee getEmployeeWithHighestSalary(Employee[] employees)
	{
		Employee emp = employees[0];
		
		for(int i = 1; i< employees.length; i++)
		{
			if(emp.getSalary() < employees[i].getSalary())
			{
				emp = employees[i];
			}
		}
		return emp;
	}
	
	
}

class TestEmployee
{
	public static void main(String[] args)
	{
		int argsIndex = 0;
		
		if(args.length < 40)
		{
			System.out.println("Error: Insufficient commandline arguments");
			message();
		}
		
		Employee[] employees = new Employee[10];
		
		for(int i = 0; i< employees.length; i++)
		{
			try
			{
				employees[i] = new Employee();
				employees[i].setEmpNo(Integer.parseInt(args[argsIndex++]));
				employees[i].setName(args[argsIndex++]);
				employees[i].setDepartment(args[argsIndex++]);
				employees[i].setSalary(Double.parseDouble(args[argsIndex++]));

			}
			catch(Exception e)
			{
				e.printStackTrace();
				message();
			}
						
			
		}
		
		System.out.println("<======================Employee Details===================>");
		
		for(Employee emp: employees)
		{
			System.out.println("Employee number: " + emp.getEmpNo());
			System.out.println("Employee name: " + emp.getName());
			System.out.println("Department: " + emp.getDepartment());
			System.out.println("Employee salary: " + emp.getSalary());
		}
		
				System.out.println("<======================Employee with highest salary===================>");
				
				Employee emp = Employee.getEmployeeWithHighestSalary(employees);
				System.out.println("Employee number: " + emp.getEmpNo());
				System.out.println("Employee name: " + emp.getName());
				System.out.println("Department: " + emp.getDepartment());
				System.out.println("Employee salary: " + emp.getSalary());

	}
	
	static void message()
	{
		System.out.println("Please provide all commandline arguments int the following order:\n"
			+"1: Arguments for 10 objects\n"
			+"2: Each employee object needs following details\n"
			+"\t a. Employee number as integer\n"
			+"\t b. Employee name as string\n"
			+"\t c. Department as string\n"
			+"\t d. Salary as double");
			System.exit(0);
	}
	
	
}