class StringManager
{
	static String insertString(String string1, String string2, char ch)
	 {
		 StringBuffer sb = new StringBuffer(string1);
		 
		 for(int i = 0; i< sb.length(); i++)
		 {
			 if(sb.charAt(i) == ch)
			 {
				 sb.insert(i, string2);
				 break;
			 }
		 }
		 
		 return new String(sb);
	 }
	 
	 public static void main(String args[])
	{
		String str1 = "Hello World";
		String str2 ="Java";
		
		System.out.println(insertString(str1, str2, 'W'));
	}
}