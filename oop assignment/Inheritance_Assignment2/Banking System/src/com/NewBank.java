package com;

import java.util.Set;
import java.util.TreeSet;

public class NewBank {
	
	Set<Account> accounts = new TreeSet<>();
	public NewBank() {}
	
	public int addAccount(Account account)
	{
		accounts.add(account);
		
		return account.getAccountId();
	}
	
	public Set<Account> getAcounts()
	{
		return accounts;
	}

}

