class Tester {
	public static void main(String[] args) {
		String str = "java";
		StringBuffer sb = new StringBuffer("java");
		sb.insert( 4, "programming");  //fixing java.lang.StringIndexOutOfBoundsException: offset 9,length 4
		str.concat("exercise");
		if (sb.length() < 6 || str.equals("java")) {
			System.out.println(sb);
		}
		sb.delete(2, 7); // deleting indext from 2 -> 7 
		System.out.print(sb);
	}
}