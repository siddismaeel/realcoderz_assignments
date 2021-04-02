package com;

public class OutOfBalanceException extends Exception {

	private double currentBalance;
	private double withDrawAmount;
	public OutOfBalanceException(double balance, double withdrawAmount)
	{
		this.currentBalance = balance;
		this.withDrawAmount = withdrawAmount;
	}

	@Override
	public String getMessage() {
		
		return currentBalance - withDrawAmount +"";
	}
}
