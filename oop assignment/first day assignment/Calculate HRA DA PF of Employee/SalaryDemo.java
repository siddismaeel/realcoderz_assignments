import java.util.Scanner;
class SalaryDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		double basic = sc.nextDouble();
		
		System.out.println("Enter basic HRA: ");
		double hra = sc.nextDouble();
		
		System.out.println("Enter basic DA: ");
		double da = sc.nextDouble();
		
		System.out.println("Enter Premium Amount: ");
		double premium = sc.nextDouble();
		
		System.out.println("Enter basic PF: ");
		double pf = sc.nextDouble();
		
		System.out.println("On hand salary is: " + calculateGrossSalary(basic, hra, da, premium, pf));
	}
	public static double calculateGrossSalary(double basic, double hra, double da, double premium, double pf)
	{
		return (basic + hra + da) - (premium + pf);
	}
}