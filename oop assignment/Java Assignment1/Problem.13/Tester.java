class Tester
{
		public static void main(String[] args) {
		int x = 1, y = 0;
		if ((y == x++) && (x < ++y)) {
		}
		System.out.println(x + "" + y);
	}
}