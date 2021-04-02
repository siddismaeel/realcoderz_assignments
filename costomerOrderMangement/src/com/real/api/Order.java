package com.real.api;

import java.util.Date;

public class Order {

	private static int totalOrder;
	private int orderId;
	private Date orderDate;
	private Customer customer;
	private String orderType;
	private Item item;
	
	public Order()
	{
		Order.totalOrder += 1; 
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public static int getTotalOrder() {
		return totalOrder;
	}
	
	
	
}
