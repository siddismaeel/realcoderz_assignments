package com.real;

public class InheritanceActivity {

	public static void main(String[] args) {
		Employee manager = new Manager(126534, "Peter", "Chennai India", 237844,65000);
		manager.calculateSalary();
		manager.calculateTransportAllowance();
		
		Employee trainee = new Trainee(29846,"Jack","Mumbai India",442085, 45000);
		trainee.calculateSalary();
		manager.calculateTransportAllowance();
	}
}
