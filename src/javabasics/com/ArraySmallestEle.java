package javabasics.com;
public class ArraySmallestEle 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,34,56,67,78,89,96,87};
		int smallestEle = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < smallestEle)
			{
				smallestEle = arr[i];
			}
		}
		
		System.out.println("smallest element of an array: " +smallestEle);
 	}
}
