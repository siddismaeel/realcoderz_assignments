class Tester 
{
	public static void main(String[] args) {
		//fixing index out of bound exception
		String entries[] = { "entry1", "entry2" };
		int count = 0;
		while (entries[count++] != "entry2") {
			System.out.println(count);
		}
		System.out.println(count);
	}
}