class Student
{
	static void compareMarks(Long maths, Double english)
	{
		Integer englishMarks = english.intValue();
		Integer mathsMarks = maths.intValue();
		
		if(englishMarks.compareTo(mathsMarks) < 0)
		{
			System.out.println("English mark is higher than Maths");
		}
		else if(englishMarks.compareTo(mathsMarks) > 0)
		{
			System.out.println("Maths mark is higher than English");
		}
		else
		{
			System.out.println("Both Are Equal");
		}
	}
	
	public static void main(String[] args) {
		
		compareMarks(Long.valueOf(85), Double.valueOf(65));
		compareMarks(Long.valueOf(56), Double.valueOf(98));
		compareMarks(Long.valueOf(84), Double.valueOf(84));
	}
}