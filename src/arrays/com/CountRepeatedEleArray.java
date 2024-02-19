package arrays.com;
//public class CountRepeatedEleArray 
//{
//	public static void main(String[] args) 
//	{
//		int arr[] = new int[] {12,23,34,23,23,45,56,67,12,67,78};
//		int countArray[] = new int[arr.length];
//		int count = 0;
//		boolean counted;
//		for(int i = 0; i < arr.length; i++)
//		{
//			counted = false;
//			if(countArray[i] == -1)
//			continue;
//			for(int j = i + 1; j < arr.length-1; j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					count++;
//				    countArray[j] = -1;
//	                counted = true;
//					//System.out.print(arr[i] +" ");
//				}
//			}
//			if(counted)
//			{
//				System.out.println(arr[i]  +" occurs"  +" "+count + " times");
//			}
//		}
//			
//	}
//}



public class CountRepeatedEleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 6,2, 4};

        // Initialize a count array to keep track of counts
        int[] countArray = new int[arr.length];

        // Initialize a flag to check if a number is counted already
        boolean counted;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            counted = false;

            // Check if the current element is already counted
            if (countArray[i] == -1) {
                continue;
            }

            // Initialize count to 1 for the current element
            int count = 1;

            // Compare the current element with the rest of the elements
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    // Mark the element as counted
                    countArray[j] = -1;
                    counted = true;
                }
            }

            // If the element was counted, print the result
            if (counted) {
                System.out.println(arr[i] + " appears " + count + " times.");
            }
        }
    }
}

