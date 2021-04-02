class PrintPrime {
	static void printPrime(int n) {

		int num = 0;
		
		String primeNumbers = "1";

		for (int i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				
				primeNumbers = primeNumbers + ", " +i ;
			}
		}
		System.out.println("Prime numbers from 1 to " +n+" are :");
		System.out.println(primeNumbers);

	}

	public static void main(String args[]) {
		printPrime(150);
	}
}