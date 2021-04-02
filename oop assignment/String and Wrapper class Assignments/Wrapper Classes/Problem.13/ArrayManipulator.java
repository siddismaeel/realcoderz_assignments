class ArrayManipulator
{
	char[] removeCharacter(char[] chars, char ch)
	{
		char[] removedChars = new char[chars.length-1];
		int lastInser = 0;
		for(int i =0; i<chars.length; i++)
		{
			if(chars[i] == ch)
			{
				i++;
			}
			
			removedChars[lastInser++] = chars[i];
		}
		
		return removedChars;
	}
	
	public static void main(String[] args) {
		char[] chars = {'a','b','c','d'};
		char[] removedCharArray = new ArrayManipulator().removeCharacter(chars, 'c');
		
		for(char ch: chars)
		{
			System.out.print(ch);
		}
		
		System.out.println("\nChar array after removing charactor 'c' is");
		
		for(char ch: removedCharArray)
		{
			System.out.print(ch);
		}
	}
}