class BankAccount 
{
	private long acctNo;
	private double balance;
	private String acctType;
	
	public BankAccount(long acctNo, double balance, String acctType)
	{
		this.acctNo = acctNo;
		this.balance = balance;
		this.acctType = acctType;
	}
	
	public void depositeAmount(double amount)
	{
		this.balance += amount;
	}
	
	public void withdrawAmount(double amount)
	{
		this.balance -= amount;
	}
	
	public void displayAmount()
	{
		System.out.println("Balance: " + this.balance);
	}
}