package com;
import java.util.Scanner;
class Item
{
	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemDiscount;
	
	public Item(int itemId, String itemName, double itemPrice, double itemDiscount)
	{
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDiscount = itemDiscount;
	}
	
	public int getItemId()
	{
		return this.itemId;
	}
	public String getItemName()
	{
		return this.itemName;
	}
	public double getItemPrice()
	{
		return this.itemPrice;
	}
	public double getItemDiscount()
	{
		return this.itemDiscount;
	}
}

class ItemDemo
{
	public static void main(String[] args)
	{
		Item[] items = new Item[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<items.length; i++)
		{
			System.out.println("Enter item id");
			int itemId = sc.nextInt();
			
			System.out.println("Enter item name");
			String itemName = sc.next();
			
			System.out.println("Enter item price");
			double itemPrice = sc.nextDouble();
			
			System.out.println("Enter item discount");
			double itemDiscount = sc.nextDouble();
			
			items[i] = new Item(itemId, itemName, itemPrice, itemDiscount);
		}
		
		Item leasItem = getLeastPriceItem(items);
		
		System.out.println("The least item is");
		System.out.println("Item id: " + leasItem.getItemId());
		System.out.println("Item name: " + leasItem.getItemName());
		System.out.println("Item price: " + leasItem.getItemPrice());
		System.out.println("Item discount: " + leasItem.getItemDiscount());
	}
	
	static Item getLeastPriceItem(Item[] items)
	{
		//Considering the first one is least
		Item item = items[0];
		
		for(Item newItem: items)
		{
			if((newItem.getItemPrice() - newItem.getItemDiscount()) < (item.getItemPrice() - item.getItemDiscount()))
			{
				item = newItem;
			}
		}
		
		return item;
	}
	
	
}