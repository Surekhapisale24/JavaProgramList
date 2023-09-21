package javabasics.com;
import java.util.*;
public class ArrayUserInpt 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number as size of an array ");
		int size= sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("enter the elements of an array");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("array elements are :");
		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
