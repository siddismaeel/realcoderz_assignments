package com.real;

import java.util.Date;

import com.real.api.Customer;
import com.real.api.Item;
import com.real.api.Order;



public class OrderDemo {

	public static void main(String[] args) {
		
		Order order = new Order();
		OrderDemo demo = new OrderDemo();
		
		demo.storeCustomerData(order);
		demo.storeItemData(order);
		demo.storeOrderData(order);
		demo.showData(order);
		
		Order order1 = new Order();
		
		demo.storeCustomerData(order1);
		demo.storeItemData(order1);
		demo.storeOrderData(order1);
		demo.showData(order1);
	}
	
	public void storeCustomerData(Order order)
	{
		Customer c = new Customer();
		c.setCustomerId(001);
		c.setCustName("Ismaeel");
		c.setEgionCode("AX9857465");
		order.setCustomer(c);
		
	}
	
	public void storeOrderData(Order order) 
	{
		order.setOrderDate(new Date("01/01/2006"));
		order.setOrderId(002);
		order.setOrderType("Cash On Delivery");
		
	}
	
	public void storeItemData(Order order)
	{
		Item item = new Item();
		item.setItemId(005);
		item.setItemNumber(9857);
		item.setRate(102);
		item.setQuantity(5);
		item.setTotal(item.getRate() * item.getQuantity());
		
		order.setItem(item);
	}
	public void showData(Order order)
	{
		System.out.println("Order Details****************************************");
		System.out.println("Order ID: " + order.getOrderId());
		System.out.println("Order Type: "+order.getOrderType());
		System.out.println("Total Order: " + order.getTotalOrder());
		System.out.println("Items************************************************* \t");
		System.out.println("Item Id: "+order.getItem().getItemId());
		System.out.println("Item Number: "+order.getItem().getItemNumber());
		System.out.println("Item Quantity: " + order.getItem().getRate());
		System.out.println("Item Quantity: "+order.getItem().getQuantity());
		System.out.println("Total: " + order.getItem().getTotal());
		System.out.println("Customer Information********************************** \t");
		
		
		System.out.println("Customer Id: "+order.getCustomer().getCustomerId());
		System.out.println("Customer Name: "+order.getCustomer().getCustName());
		System.out.println("Order Egion Code: "+order.getCustomer().getEgionCode());
		
		
		
	}

}
