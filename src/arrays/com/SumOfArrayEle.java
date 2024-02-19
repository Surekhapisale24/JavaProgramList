package arrays.com;
public class SumOfArrayEle 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,23,34,45,56,67,78,89,90};
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all element of an array: " +sum);
 	}
}
