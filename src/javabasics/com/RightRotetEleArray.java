package javabasics.com;
public class RightRotetEleArray
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,23,34,45,56,67,78,89,90};
		
		int n = 3;
		System.out.println("Orignal Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
		
		for(int i = 0; i < n; i++)
		{
			int j;
			int last;
			last = arr[arr.length-1];
			for( j = arr.length-1; j>0; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		System.out.println();
		System.out.println("array elements after right rotation: ");
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}

}
