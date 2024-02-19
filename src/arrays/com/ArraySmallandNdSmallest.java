package arrays.com;
public class ArraySmallandNdSmallest 
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {12,34,56,78,1,90,67,-14,45,23};
		int smallest = 100;
		int secondSmallest = 99;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < smallest)
			{
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] < secondSmallest)
			{
				secondSmallest = arr[i];
			}
		}
		System.out.println("smallest and secondsmallest numbers are :" +smallest+" "+secondSmallest);
 	}
}
