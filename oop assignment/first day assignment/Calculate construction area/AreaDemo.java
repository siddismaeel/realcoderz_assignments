import java.util.Scanner;
class AreaDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter plot length:");
		double plotLength = sc.nextDouble();
		System.out.println("Enter plot width:");
		double plotWidth = sc.nextDouble();
		System.out.println("Enter construction area length:");
		double constLength = sc.nextDouble();
		System.out.println("Enter construction area width:");
		double constWidth = sc.nextDouble();
		double openArea = calculateArea(plotLength, plotWidth, constLength, constWidth);
		System.out.println("Open area = " + openArea);
		
	}
	
	public static double calculateArea(double plotLength, double plotWidth, double constLength, double constWidth)
	{
		double openArea = 0;
		
		openArea = plotLength*plotWidth - constLength*constWidth;
		
		return openArea;
	}
}