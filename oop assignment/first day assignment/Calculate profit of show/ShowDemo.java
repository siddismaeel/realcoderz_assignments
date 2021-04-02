import java.util.Scanner;
class ShowDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fixed Cost:");
		double fixedCost = sc.nextDouble();
		System.out.println("Enter variable Cost:");
		double variableCost = sc.nextDouble();
		System.out.println("Enter rate:");
		double ratePerTicket = sc.nextDouble();
		System.out.println("Enter number of attendess:");
		double noOfAttendees = sc.nextDouble();
		
		System.out.println("Profit of show: " + calculateProfit(fixedCost, variableCost,ratePerTicket, noOfAttendees));
		
	}
	
	public static double calculateProfit(double fixedCost, double variableCost, double ratePerTicket, double noOfAttendees)
	{
		return (fixedCost + variableCost) - (ratePerTicket * noOfAttendees);
	}
}