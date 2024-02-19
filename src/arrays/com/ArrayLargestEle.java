package arrays.com;
public class ArrayLargestEle 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,34,56,67,78,89,96,87};
		int largestEle = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > largestEle)
			{
				largestEle = arr[i];
			}
		}
		
		System.out.println("lergest element of an array: " +largestEle);
 	}
}
