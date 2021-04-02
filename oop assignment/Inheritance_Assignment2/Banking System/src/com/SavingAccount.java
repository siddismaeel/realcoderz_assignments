package com;

public class SavingAccount extends Account {

	public SavingAccount(int accountId, int customerId, double balance) {
		super(accountId, customerId, balance);

	}

	@Override
	public void deposite(double amount) {

		this.setBalance(this.getBalance() + amount);

	}

	@Override
	public void withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);

	}

}
