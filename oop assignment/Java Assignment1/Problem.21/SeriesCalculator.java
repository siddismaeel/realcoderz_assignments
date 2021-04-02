import java.util.Scanner;
class SeriesCalculator {
	static int calculateSum(int n) {
		int a = 1; // said to be first term
		int d = 2; // said to be difference
		int sum = 0;

		int tn;

		sum = (n * (2 * a + (n - 1) * d)) / 2;
		tn = a + (n - 1) * d;
		System.out.println("Sum of the A.P series is: ");
		for (int i = a; i <= tn; i = i + d) {
			if (i != tn)
				System.out.print(i + ", ");
			
		}

		return sum;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		
		System.out.println("the sum of " + n + " term is " + calculateSum(n));
	}

}