class Titanic {
	public static void main(String[] args) {
		Boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		if ((b1 & b2) | (b2 & b3) & b3)
			System.out.print("alpha ");
		if ((b1 = false) | (b1 & b3) | (b1 | b2))
			System.out.print("beta ");
	}
}