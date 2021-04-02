package com;

import java.util.ArrayList;
import java.util.List;

public class ToyDemo {
	public static void main(String[] args) {

		Toy one = new Toy("water melon", "fruits", 123, 20);
		Toy two = new Toy(" Pineapple", "fruits", 105, 13);
		Toy three = new Toy("teddy bear", "animal", 134, 30);
		Toy four = new Toy("rubber ducky", "animal", 144, 33);

		System.out.println(
				"Toy with least price of category fruit is " + getLeastPriceToy(one, two, three, four, "fruits"));

	}

	private static String getLeastPriceToy(Toy one, Toy two, Toy three, Toy four, String category) {

		String toyName = "no category found";
		Toy leastPrieToy = null;
		Toy[] toys = new Toy[4];

		toys[0] = one;
		toys[1] = two;
		toys[2] = three;
		toys[3] = four;

		List<Toy> categorizedToys = new ArrayList<>();

		// Categorizing the toys
		for (int i = 0; i < toys.length; i++) {

			if (toys[i].getCategory().equals(category)) {

				categorizedToys.add(toys[i]);
			}
		}

		if(categorizedToys.size() > 0)
		{
			leastPrieToy = categorizedToys.get(0);
			for (Toy toy : categorizedToys) {

				if (leastPrieToy.getPrice() - leastPrieToy.getDiscount() > toy.getPrice() - toy.getDiscount()) {
					leastPrieToy = toy;
				}

			}
		}
		 

		if (leastPrieToy != null)
			toyName = leastPrieToy.getName();

		return toyName;
	}

}
