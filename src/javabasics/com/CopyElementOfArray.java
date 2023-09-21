package javabasics.com;
import java.util.*;
public class CopyElementOfArray 
{
	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number as size of an array ");
//		int size= sc.nextInt();
//		int arr[] = new int[size];
//		
//		System.out.println("enter the elements of an array");
//		for(int i=0; i<size; i++)
//		{
//			arr[i] = sc.nextInt();
//		}
//		System.out.println("array elements are :");
//		for(int i=0; i<size; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		int arr1[] = new int[] {23,45,67,89,54};
		int arr2[] = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++)
		{
			arr2[i] = arr1[i];
		}
		
		System.out.println("element of an orignal array: ");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("element of an copied array: ");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
