
class ArrayManipulator
{
	int[]  changeArrau(int [] arr)
	{
		int[] result = new int[arr.length];
		
		for(int i = 0; i< arr.length; i++)
		{
			if(i == arr.length -1)
			{
				result[i] = arr[i];
				break;
			}
			result[i] = arr[i] * arr[i+1];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println("Original array: ");
		for(int e : arr)
		{
			System.out.print(e + ", ");
		}
		
		arr = new ArrayManipulator().changeArrau(arr);
		
		System.out.println("\nAfter changing array: ");
		
		for(int e : arr)
		{
			System.out.print(e + ", ");
		}
	}
}


