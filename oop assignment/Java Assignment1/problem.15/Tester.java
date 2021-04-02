public class Tester {
	public static void main(String[] args) {
		//fixing the problem
		boolean b1 = false;
		boolean b2 = false;
		do {
			System.out.print("inside do");
		} while (b1);
		while (b2) {
			System.out.print("inside while");
		}
		System.out.print("outside");
	}
}