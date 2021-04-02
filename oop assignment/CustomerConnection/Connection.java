package com.real;
import java.util.*;
class Connection
{
	private int connId;
	private int customerId;
	private String  CustomerEmail;
	private double balance;
	
	public Connection(int connId,int customerId,String email,double balance)
	{ 
		this.connId = connId;
		this.customerId = customerId;
		this.CustomerEmail = email;
		this.balance = balance;
	}
	
	public int getConnId()
	{
		return this.connId;
	}
	public int getCustomerId()
	{
		return this.customerId;
	}
	public String getCustomerEmail()
	{
		return this.CustomerEmail;
	}
	public double getBalance()
	{
		return this.balance;
	}
}
class ConnectionDemo
{
	public static void main(String[] args)
	{
		Connection[] connections = new Connection[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < connections.length; i++)
		{
			System.out.println("Enter the connection Id: ");
			int connId = sc.nextInt();
			
			System.out.println("Enter the customer Id: ");
			int cutomerId = sc.nextInt();
			
			System.out.println("Enter the customer email: ");
			String email = sc.next();
			
			System.out.println("Enter the balance: ");
			double balance = sc.nextDouble();
			
			connections[i] = new Connection(connId, cutomerId, email, balance);
		}
		
		System.out.println("Enter the id to get average balance");
		int id = sc.nextInt();
		
		System.out.println("Average balance of id: " +id +"is: " + getAverageBalance(connections,id));
		System.out.println("Average balance of id: " +id +"is " + getAverageBalance(connections,id));
	}
	
	static double getAverageBalance(Connection[] connections, int customerId)
	{
		double totalBalance = 0.0;
		double averageBalance = 0.0;
		int occuranceOfId = 0;
		for(Connection con: connections)
		{
			if(con.getCustomerId() == customerId)
			{
				totalBalance += con.getBalance();
				occuranceOfId++;
			}
		}
		
		if(occuranceOfId > 0 && totalBalance > 0.0)
		{
			averageBalance = totalBalance / occuranceOfId;
		}
		
		return averageBalance;
	}
}