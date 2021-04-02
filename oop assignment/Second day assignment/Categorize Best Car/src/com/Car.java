package com;

public class Car {
	
	private String make;
	private String model;
	private int passengerCapacity;
	private double onRoadPrice;
	public Car(String make, String model, int passengerCapacity, double onRoadPrice) {
		
		this.make = make;
		this.model = model;
		this.passengerCapacity = passengerCapacity;
		this.onRoadPrice = onRoadPrice;
	}
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getPassengerCapacity() {
		return this.passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public double getOnRoadPrice() {
		return this.onRoadPrice;
	}
	public void setOnRoadPrice(double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	
	
	
	
	
	
	

}
