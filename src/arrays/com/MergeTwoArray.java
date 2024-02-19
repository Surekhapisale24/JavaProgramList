package arrays.com;

import java.util.Arrays;

public class MergeTwoArray
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[] {12,23,34,45,56};
		int arr2[] = new int[] {67,78,89,90};
		int length = arr1.length+arr2.length;
		int mergedarray[] = new int[length];
		int index = 0;
		for(int element : arr1)
		{
			mergedarray[index] = element;
			index++;
		}
		
		for(int element : arr2)
		{
			mergedarray[index] = element;
			index++;
		}
		System.out.println(Arrays.toString(mergedarray));
	}
}
