package com.real.api;

import java.util.Random;

public class TravelCard extends PrepaidCard implements Rewardable{

	private int rewardPoints;
	
	@Override
	public boolean swipeCard(double amount) {
		double inrValue = amount * 60;
		System.out.println("Inr value" + inrValue);
		double processingCharge = inrValue * 0.05;
		boolean flag = false;
		if(this.cardNo == 0)
		{
			System.out.println("Please Register the card first");
			return flag;
		}
		
		if(inrValue <= availableBalance && inrValue <= swipeLimit)
		{
			availableBalance = availableBalance - (inrValue + processingCharge);
			System.out.println("Amount withdrawn: " + inrValue);
			System.out.println("Amount deducted from your card including processing charge: " + (inrValue + processingCharge));
			System.out.println("Processing Charge: " + processingCharge);
			System.out.println("Your have earned reward points: " + calculateRewardPoints(amount));
			System.out.println("Total reward points: " + this.rewardPoints);
			System.out.println("Available balnce: " + availableBalance);
			flag = true;
			
		}
		else if(inrValue > swipeLimit)
		{
			System.out.println("Limit is over!");
			flag = false;
		}
		else
		{
			System.out.println("Insufficient balance!" + availableBalance);
			flag = false;
		}
		return flag;
	}
	@Override
	public int calculateRewardPoints(double amount) {
		double inrValue = amount * 60;
		int points = ((int) (inrValue/100)) * 5;
		
		rewardPoints += points;
		return points;
	}
	@Override
	public void displayAmount() {
		if(this.cardNo == 0)
			System.out.println("Please Register the card first");
		else
			System.out.println("Available balance: " + this.availableBalance);
		
			
			
		
		
		
	}
	@Override
	public void registerCard() {
		Random rand = new Random();
	      int upperbound = 2555;
	        
	      this.cardNo   = rand.nextInt(upperbound);
		
		
	}

}
