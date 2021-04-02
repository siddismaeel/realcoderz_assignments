
class Student
{
	static void validateFees(Double fees)
	{
		if (fees.isInfinite())
		{
			System.out.println("Fees is infinite");
		}
		else
		{
			System.out.println("Fees is not infinite");
			System.out.println(fees.byteValue());
		}
	}
	
	public static void main(String[] args) {
		
		validateFees(1/0.0);
		validateFees(Double.valueOf(128));
	}
}
