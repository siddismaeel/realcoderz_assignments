class ArrayManipulator
{
	int[ ] changeNumber(int [ ] elements)
	{
		for(int i = 0; i<elements.length;i++)
		{
			if(elements[i] % 2 == 0)
			{
				elements[i]--;
			}
			else
			{
				elements[i]++;
			}
		}
		
		return elements;
	}
	
	
	public static void main(String[] args) {
		
		int[] shiftedElements = new ArrayManipulator().changeNumber(new int[] {5,6,8,9});

		System.out.println("Shifted elements from even to odd and odd to even are: ");
		for(int e: shiftedElements)
		{
			System.out.print(e + ", ");
		}
	}
}