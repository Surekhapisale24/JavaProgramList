package arrays.com;
import java.util.Arrays;
import java.util.*;
public class RemoveDuplicateEleOfUnsortedArray
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,23,34,45,56,34,45,45,78,89,90,34,34};
		//using hashset
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 0; i < arr.length; i++)
		{
			hs.add(arr[i]);
		}
		
		for(int no:hs)
		{
			System.out.print(no +" ");
		}
		
		//using sort function
//		Arrays.sort(arr);
//		int temp[] = new int[arr.length];
//		int j = 0;
//		for(int i = 0; i < arr.length-1; i++)
//		{
//			if(arr[i] != arr[i+1])
//			{
//				temp[j] = arr[i];
//				j++;
//			}
//		}
//		temp[j] = arr[arr.length-1];
//		for(int i = 0; i < temp.length; i++)
//		{
//			System.out.print(temp[i] +" ");
//		}
	}
}