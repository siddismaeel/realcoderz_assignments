public class Tester
{
		public static void main(String[] args) {
		int x = 0, y = 0;
		x = 5 + y++;
		System.out.print(x + "" + y);
		x = 0;
		y = 0;
		x = 5 + ++y;
		System.out.print(x + "" + y);

	}
}