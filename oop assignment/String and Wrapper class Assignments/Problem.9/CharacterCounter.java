class CharacterCounter
{
	static int countCharacter(String string, char ch)
	{
		int count = 0;
		for(char c: string.toCharArray())
		{
			if(ch == c)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String args[])
	{
		String str = "Ismaeel";
		
		System.out.println(countCharacter(str, 'e'));
	}
}