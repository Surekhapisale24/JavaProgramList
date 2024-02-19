package arrays.com;
public class ArrayEleReverseOrd
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {12,34,56,78,89,46};
		System.out.println("Elements of an array are reverse order: ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(" " +arr[i]);
		}
	}
}
