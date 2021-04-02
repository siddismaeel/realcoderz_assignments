package com.real;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		
		Medicine[] medicines = new Medicine[5];
		Random rand = new Random();
		
		
		for(int i = 0; i< medicines.length; i++)
		{
			int choice = rand.nextInt(3);
			
			switch(choice)
			{
			case 0:
				medicines[i] = new Tablet();
				medicines[i].setPrice(66.12);
				medicines[i].setExpiryDate(new GregorianCalendar(2024,11,14).getTime());
				break;
			case 1: 
				medicines[i] = new Syrup();
				medicines[i].setPrice(90.12);
				medicines[i].setExpiryDate(new GregorianCalendar(2023,9,14).getTime());
				break;
			case 2: 
				medicines[i] = new Ointment();
				medicines[i].setPrice(58.12);
				medicines[i].setExpiryDate(new GregorianCalendar(2022,5,22).getTime());
				break;
				default:
					System.out.println("Some erro occured!");
			}
		}
		
		for(int i = 0; i<medicines.length; i++)
		{
			medicines[i].displayLabel();
		}

		
	}

}
