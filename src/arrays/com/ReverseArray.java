package arrays.com;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {23,45,67,-87,-45,-34};
		System.out.println("Orignal array is ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Reverse array is ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
 	}
}
