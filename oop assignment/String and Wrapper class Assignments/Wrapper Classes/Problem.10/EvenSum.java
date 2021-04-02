class EvenSum
{
	int  getSmallest(int [ ] elements)
	{
		int smallest = elements[0];
		for(int i =1; i< elements.length; i++)
		{
			if(smallest > elements[i])
			{
				smallest = elements[i];
			}
		}
		
		return smallest;
	}
	
	public static void main(String[] args) {
		
		System.out.println("The smalest elemet of given array is: " + new EvenSum().getSmallest(new int[] {4,5,-7,1,9,4,-5}));
	}
}