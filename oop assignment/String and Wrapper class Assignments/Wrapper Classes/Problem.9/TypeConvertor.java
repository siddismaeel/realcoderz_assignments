class TypeConvertor
{
	Long  binaryToLong(String binaryNumber)
	{
		
		return Long.parseLong(binaryNumber,2);
		
	}
	
	int  stringToInteger(String integerValue)
	{
		return Integer.parseInt(integerValue);
		
	}
	
	public static void main(String[] args) {
		String binaryNumber = "1111";
		String stringToInteger = "254";
		System.out.println("Long value of binary number "+binaryNumber+" is: " +new TypeConvertor().binaryToLong(binaryNumber));
		System.out.println("Integer value of string "+stringToInteger+" is: " +new TypeConvertor().stringToInteger(stringToInteger));

	}
	
	
}