class Tester {
	public static void main(String[] args) {
		StringBuffer buffer1 = new StringBuffer("java");
		StringBuffer buffer2 = new StringBuffer(buffer1);
		if (buffer1.equals(buffer2))
			System.out.println("true");
		else
			System.out.println("false");
	}

}