package javabasics.com;
import java.util.*;
public class SearchElementOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("take elements of an array");
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("take any value for searching");
		int x = sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == x)
			{
				System.out.println("x found at index :" +i);
			}
		}
	}
}
