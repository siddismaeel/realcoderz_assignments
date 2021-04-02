import java.util.Scanner;
class PrimeChecker
{
	static boolean checkPrime(int n)
	{
		boolean b = false;
		for(int i = n-1; i > 1; i--)
		{
			if(n % i == 0)
			{
				b = true;
				break;
			}
		}
		
		return b;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		boolean checkPrime = checkPrime(number);
		
		if(checkPrime)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
}