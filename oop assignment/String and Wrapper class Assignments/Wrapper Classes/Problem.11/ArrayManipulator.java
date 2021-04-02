class ArrayManipulator
{
	int getArraySum(int [ ] elements)
	{
		int sum = 0;
		for(int e: elements)
		{
			sum += e;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of array elements is: " + new ArrayManipulator().getArraySum(new int[] {5,6,2,8,-2,12}));
	}
}