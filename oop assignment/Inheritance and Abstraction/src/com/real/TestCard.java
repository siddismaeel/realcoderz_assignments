package com.real;

import java.util.Scanner;

import com.real.api.TravelCard;

public class TestCard {

	public static void main(String[] args) {
		
		 TravelCard travelCard = new TravelCard();
		Scanner sc = new Scanner(System.in);
		
		char choice = ' ';
		
		

		while(choice != '0')
		{
			System.out.println("Enter your choice"
					+ "\n 1: For register a new card"
					+ "\n 2: For deposite amount"
					+ "\n 3: For withdraw amount"
					+ "\n 4: To display amount"
					+ "\n 5: For card info"
					+ "\n 0: For exit");
			
			choice = sc.next().charAt(0);
			
			switch(choice)
			{
			case '1':
				travelCard.registerCard();
				break;
				
			case '2':
				System.out.println("Please enter the amount in INR");
				int amount = sc.nextInt();
				travelCard.rechargeCard(amount);
				break;
			case '3':
				System.out.println("Please enter the amount in dollar to withdraw");
				amount = sc.nextInt();
				travelCard.swipeCard(amount);
				break;
			case '4':
				travelCard.displayAmount();
				break;
			case '5':
				System.out.println(travelCard);
				break;
			case '0':
				System.out.println("Terminated!");
				System.exit(0);
				
				default :
					System.out.println("Invalid input!");
				
			}
		}
	}

}
