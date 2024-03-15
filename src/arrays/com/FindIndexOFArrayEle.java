package arrays.com;
public class FindIndexOFArrayEle
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {12,34,56,78,90};
		int value = 56;
		int index = findIndexOfNumber(arr, value);
		if(index != -1)
		{
			System.out.println("element: " +value+ " found at index " +index);
		}
		else
		{
			System.out.println("elemetn not found");
		}
	}
	
	public static int findIndexOfNumber(int arr[], int value)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
}
