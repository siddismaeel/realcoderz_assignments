import java.util.Scanner;
class Calculator
{
	static int calculateSum(int number1, int number2)
	{
		return number1 + number2;
	}
	
	static int calculateDifference(int number1, int number2)
	{
		return number1 - number2;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number" );
		int number1 = sc.nextInt();
		
		System.out.println("Enter second number" );
		int number2 = sc.nextInt();
		
		System.out.println("Sum of two Numbers " + number1 + " and " + number2 + " " + calculateSum(number1, number2));
		System.out.println("Difference  of two Numbers " + number1 + " and " + number2 + " " + calculateDifference(number1, number2));
		int x = 0;
		
		System.out.println(++x);
	}
}