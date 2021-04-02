import java.util.Scanner;
class NumberManipulator
{
	public static int reverseNumber(int number)
	{
		int reverseNumber = 0;
		
		while(number > 0)
		{
			int rem = number % 10;
			reverseNumber = reverseNumber * 10 + rem;
			number = number /10;
		}
		
		return reverseNumber;
	}
	
	public static int calculateSum(int number)
	{
		int sum = 0;
		
		while(number > 0)
		{
			int rem = number % 10;
			 sum += rem;
			number = number /10;
		}
		
		return sum;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println("The reverse of number: " + number + " is " + reverseNumber(number));
		System.out.println("The sum of number: " + number + " is " + calculateSum(number));

	}
	
	
}