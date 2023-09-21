package javabasics.com;
public class LeftRotateArrayEle
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,23,34,45,78,89};
		int n = 3;
		System.out.println("Orignal array: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		for(int i = 0; i < n; i++)
		{
			int j;
			int first;
			first = arr[0];
			for(j = 0; j < arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
		System.out.println();
		System.out.println("array after left rotation: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
	}

}
