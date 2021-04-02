class CaseTest {
	public static void main(String... s) {
		
		//After fixing the duplicate case
		char c = 'a';
		switch (c) {
		case 'b': {
			System.out.println("a");
			break;
		}
		case 97: {
			System.out.println("97");
			break;
		}
		}
	}
}