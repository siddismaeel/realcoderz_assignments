package com;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class BankDemo {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		Account ac1 = new SavingAccount(1, 1, 2000);
		Account ac2 = new SavingAccount(2, 2, 2000);
		Account ac3 = new SavingAccount(3, 2, 2000);
		 
		System.out.println(bank.addAccount(ac1));
		System.out.println(bank.addAccount(ac2));
		System.out.println(bank.addAccount(ac3));
		
		
		
		
		System.out.println(bank.deposite(1, 2500));
		try {
			bank.withdraw(2, 2500);
		} catch (OutOfBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Set<Entry<Integer, Account>> entrySet = bank.getAccountHashMap().entrySet();
		
		Set<Integer> uniqueCustomerIds = bank.getUniqueCustomerIds();
		System.out.println("Unique customer ids: " + uniqueCustomerIds);
		
		Iterator<Entry<Integer, Account>> itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer, Account> entry = itr.next();
			Account account = entry.getValue();
			System.out.println("Account Id: " + entry.getKey() + " Customer id: " + account.getCustomerId() + " Balance: " + account.getBalance());
			
		}
		Account ac4 = new SavingAccount(3, 4, 2000);
		bank.addAccount(ac4);
	}
}
