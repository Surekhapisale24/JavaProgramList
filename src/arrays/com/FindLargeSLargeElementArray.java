package arrays.com;

public class FindLargeSLargeElementArray {
	public static void main(String[] args) {
		int arr[] = {24,45,67,65,56,78,90};
		int largest = 0; 
		int secondlargest = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > largest)
			{
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondlargest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println("SL & L numbers are " +secondlargest + " " +largest);
	}	
}
