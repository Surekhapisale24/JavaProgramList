package javabasics.com;
import java.util.*;
public class SearchArrayElement {
	public static void main(String[] args)
	{
		int arr[] = {10,23,45,56,78,78,89};
		int x = 56;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == x)
			{
				System.out.println("element found at an index " +i);
			}
		}
	}
}
