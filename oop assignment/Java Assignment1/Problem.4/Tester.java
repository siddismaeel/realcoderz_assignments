public class Tester {
	public static void main(String[] args) {
		boolean flag = true;
		int x = 5;
		int result = (8 * 2) % x;
		System.out.print(!(result > 0) ^ true ^ (flag = false));
		System.out.print(flag);
	}
}