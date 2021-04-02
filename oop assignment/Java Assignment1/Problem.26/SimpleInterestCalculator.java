class SimpleInterestCalculator {
	double principalAmount;
	int noOfYears;

	void calculateSimpleInterest() {
		double simpleInterest = 0.0;
		if (principalAmount > 100000) {
			if (noOfYears > 10) {
				simpleInterest = principalAmount * noOfYears * 10 / 100;
			} else {
				simpleInterest = principalAmount * noOfYears * 9.5 / 100;
			}
		} else {
			if (noOfYears > 10) {
				simpleInterest = principalAmount * noOfYears * 5 / 100;
			} else {
				simpleInterest = principalAmount * noOfYears * 4.5 / 100;
			}
		}
		System.out.println("The interest amount for a principal of " + principalAmount + " and years " + noOfYears
				+ " is " + simpleInterest);
	}

	public static void main(String[] args) {
		SimpleInterestCalculator cal = new SimpleInterestCalculator();
		cal.principalAmount = 200000;
		cal.noOfYears = 12;

		cal.calculateSimpleInterest();
		
		cal.principalAmount = 50000;
		cal.noOfYears = 12;
		
		cal.calculateSimpleInterest();
		
		cal.noOfYears = 5;
		
		cal.calculateSimpleInterest();
	}
}