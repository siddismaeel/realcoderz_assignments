package com.real.api;

public abstract class PrepaidCard {

	int cardNo;
	double availableBalance;
	double swipeLimit = 5000;
	
	public abstract boolean swipeCard(double ammount);
	public abstract void displayAmount();
	public abstract void registerCard();

	public void rechargeCard(double amount)
	{
		if(this.cardNo == 0)
			System.out.println("Please register the card first!");
		else
			this.availableBalance += amount;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	
}
