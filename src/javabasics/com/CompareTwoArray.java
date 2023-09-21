package javabasics.com;

import java.util.Arrays;

public class CompareTwoArray
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[] {12,23,34,45,56,67,78,89,90};
		int arr2[] = new int[] {12,23,34,45,56,67,78,89,90};
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
	}
}
