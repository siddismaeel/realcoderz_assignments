class Tester {
	
	//Changing this method to static
	static boolean isEven(int x) {
		return (x % 2 == 0) ? true : false;
	}

	public static void main(String[] args) {
		System.out.print(isEven(2));
		System.out.print(isEven(3));
		System.out.print(isEven(4));
	}
}