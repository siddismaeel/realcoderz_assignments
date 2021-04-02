package com;


public class CarDemo {

	public static void main(String[] args) {

		Car car1 = new Car("Maruti Suzuki", "Swift", 4, 573000);
		Car car2 = new Car("Tata Motors", "Tata Safari", 8, 1400000);
		Car car3 = new Car("Mahindra", "Mahindra XUV300", 8, 1270000);
		Car car4 = new Car("Honda Cars", "Honda City", 4, 929000);

		System.out.println("Best Car is: " + getBestCar(car1, car2, car3, car4, 'p'));
	}

	private static String getBestCar(Car car1, Car car2, Car car3, Car car4, char c) {

		String carName = "no category found";
		Car bestCar = null;
		Car[] cars = new Car[4];

		cars[0] = car1;
		cars[1] = car2;
		cars[2] = car3;
		cars[3] = car4;

		

		switch (c) {
		
		case 'p':
			Car leastPriceCar = cars[0];
			System.out.println("In p");
			for (int i = 1; i < cars.length; i++) {

				if (leastPriceCar.getOnRoadPrice() > cars[i].getOnRoadPrice()) {

					leastPriceCar = cars[i];
				}
			}

			bestCar = leastPriceCar;

			break;
		case 'c':
			Car mostCapacitiveCar = cars[0];
			System.out.println("In c");
			for (int i = 1; i < cars.length; i++) {

				if (mostCapacitiveCar.getPassengerCapacity() < cars[i].getPassengerCapacity()) {

					mostCapacitiveCar = cars[i];
				}
			}

			bestCar = mostCapacitiveCar;

			break;
		default:
		}

		if (bestCar != null)
			carName = bestCar.getMake() + "_" + bestCar.getModel();

		return carName;

	}

}
