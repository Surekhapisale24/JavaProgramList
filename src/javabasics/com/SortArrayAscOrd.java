package javabasics.com;
public class SortArrayAscOrd
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,34,56,23,45};
		int temp = 0; 
		
		System.out.println("element of an orignal array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 				}
			}
		}
		
		System.out.println("element of an array with sorted ascendending order: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
