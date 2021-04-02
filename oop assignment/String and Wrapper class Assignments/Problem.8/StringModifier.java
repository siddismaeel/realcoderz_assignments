class StringModifier
{
	static String  insertCharacter( String string , char c, int position)
	{
		StringBuffer sb = new StringBuffer(string);
		
		
		String finalString = "";
		
		if(position > sb.length())
		{
			sb = new StringBuffer("Position is out of length of String");
		}
		else
		{
			sb.insert(position, c);
		}
		
		return new String(sb);
	}
	
	public static void main(String args[])
	{
		String str = "Ismaeel";
		
		System.out.println(insertCharacter(str, 'S', 7));
	}
}