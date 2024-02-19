package arrays.com;
public class PrintDuplicateArrayEle 
{
	public static void main(String[] args)
	{

		int arr[] = new int[] {23,45,67,89,45,54,89};
		System.out.println("Duplicate elements of an array: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j] )
				{
					System.out.println(arr[j]);
				}	
			}
		}		
		
//		 int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
//	        System.out.println("Duplicate elements in given array: ");  
//	        //Searches for duplicate element  
//	        for(int i = 0; i < arr.length; i++) {  
//	            for(int j = i + 1; j < arr.length; j++) {  
//	                if(arr[i] == arr[j])  
//	                    System.out.println(arr[j]);  
//	            }  
//	        }  
	}
}
