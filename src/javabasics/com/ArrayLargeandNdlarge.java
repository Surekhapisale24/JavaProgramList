package javabasics.com;
public class ArrayLargeandNdlarge
{
	public static void main(String[] args) 
	{
		 int arr[] = new int[] {23,35,56,78,98,87,76,89,90};
		 int largestEle = 0;
		 int secondlargestEle = 0;
		 
		 for(int i = 0; i < arr.length; i++)
		 {
			 if(arr[i] > largestEle)
			 {
				 //secondlargestEle = largestEle;
				 largestEle = arr[i];
			 }
			 
			 else if(arr[i] > secondlargestEle)
			 {
				 secondlargestEle = arr[i];
			 }
		 }
		 
		 System.out.println("largest and secondlargest element of an arrays are: " +largestEle +" "+secondlargestEle);
	}
}
