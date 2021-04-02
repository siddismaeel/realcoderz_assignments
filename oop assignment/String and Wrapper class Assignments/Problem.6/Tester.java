class Tester {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;
		if (s1 == s2)
			System.out.print("A");
		if (s1.equals(s2))   //NullPointerException
			System.out.print("B");
	}

}