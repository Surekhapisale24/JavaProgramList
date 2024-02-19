package arrays.com;
public class AverageOfArray
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,23,34,45,56,67,78,89,90};
		int length = arr.length;
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		double average = sum / length;
		System.out.println("Sum of given array is: " +sum);
		System.out.println("Average of given array is: " +average);
 	}
}
