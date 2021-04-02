class Employee
{
	private int empNo;
	private String name;
	private String department;
	private double salary;
	
	
	public static void main(String... args)
	{
		Employee emp = new Employee();		
		
		emp.empNo = Integer.parseInt(args[0]);	
		emp.name = args[1];
		emp.department = args[2];
		emp.salary = Double.parseDouble(args[3]);
		
		System.out.println("employee number: " + emp.empNo);
		System.out.println("employee name: " + emp.empName);
		System.out.println("Department: " + emp.emp.department);
		System.out.println("employee salary: " + emp.salary);
		
	}
	
}