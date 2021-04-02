package com;

public class Customer {

	private int custId;
	private int accId;
	private double creditCardCharges;

	public Customer(int custId, int accId, double creditCardCharges) {

		this.custId = custId;
		this.accId = accId;
		this.creditCardCharges = creditCardCharges;
	}

	public int getCustId() {
		return custId;
	}

	public int getAccId() {
		return accId;
	}

	public double getCreditCardCharges() {
		return creditCardCharges;
	}

	public void setCreditCardCharges(double creditCardCharges) {
		this.creditCardCharges = creditCardCharges;
	}
	
	

}


class ArrayManipulator
{
	int[]  changeArrau(int [] arr)
	{
		int[] result = new int[arr.length];
		
		for(int i = 0; i< arr.length-1; i++)
		{
			result[i] = arr[i] * arr[i+1];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println("Original array: ");
		for(int e : arr)
		{
			System.out.print(e + ", ");
		}
		
		arr = new ArrayManipulator().changeArrau(arr);
		
		System.out.println("\nAfter changing array: ");
		
		for(int e : arr)
		{
			System.out.print(e + ", ");
		}
	}
}


