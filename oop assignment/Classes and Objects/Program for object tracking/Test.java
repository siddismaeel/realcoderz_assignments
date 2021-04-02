class Test
{
	static int count = 0;
	
	public Test()
	{
		count++;
	}
	static public void display()
	{
		System.out.println("Number of objects created: " + count);
	}
	
	public static void main(String... args)
	{
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t3.display();
		
		Test t4 = new Test();
		
		t4.display();
	}
}