package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Bank {

	private List<Account> accounts = new ArrayList<Account>();

	public boolean addAccount(Account account) {
		boolean exists = false;

		for (Account ac : accounts) {
			if (ac.getAccountId() == account.getAccountId()) {
				exists = true;
				break;
			}
		}

		if (!exists)
			accounts.add(account);

		return exists;
	}

	public double deposite(int accountId, double amount) {
		double newBalance = -1;

		for (Account account : accounts) {

			if (account.getAccountId() == accountId) {
				System.out.println(accountId);
				account.deposite(amount);
				newBalance = account.getBalance();
			}
		}

		return newBalance;
	}

	public double withdraw(int accountId, double amount) throws OutOfBalanceException {
		double newBalance = -1;
		for (Account account : accounts) {
			if (account.getAccountId() == accountId) {
				if (amount <= account.getBalance()) {
					account.withdraw(amount);
					newBalance = account.getBalance();
				} else {
					throw new OutOfBalanceException(account.getBalance(), amount);
				}

			}
		}

		return newBalance;
	}

	Set<Integer> getUniqueCustomerIds() {
		Set<Integer> uniqueIds = new HashSet<Integer>();

		for (Account account : accounts) {
			uniqueIds.add(account.getCustomerId());
		}

		return uniqueIds;

	}

	Map<Integer, Account> getAccountHashMap() {
		Map<Integer, Account> hm = new HashMap<>();
		for (Account account : accounts) {
			hm.put(account.getAccountId(), account);
		}
		return hm;
	}

}
