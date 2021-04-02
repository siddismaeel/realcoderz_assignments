package com;

public abstract class Account {
	private int accountId;
	private int customerId;
	private double balance;
	public Account(int accountId, int customerId, double balance) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.balance = balance;
	}
	
	

	public abstract void deposite(double amount);
	public abstract void withdraw(double amount);
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
