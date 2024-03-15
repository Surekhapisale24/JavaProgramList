package arrays.com;
public class InserEleOfSpeArrayIdx 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {12,23,34,56,67}; 
		int length = arr.length;
		int tempArraylength = length+1;
		int num = 45;
		int indexpos = 3;
		int tempArray[] = new int[tempArraylength];
		
		for(int i = 0; i < tempArraylength; i++)
		{
			if(i != indexpos && i < indexpos)
			{
				tempArray[i] = arr[i];
			}
			else if(indexpos == i)
			{
				tempArray[i] = num;
			}
			else
			{
				tempArray[i] = arr[i-1];
			}
		}
		
		System.out.println("element of an 3rd index is: " +tempArray[3]);
		System.out.println("element of an tempArrays are: ");
		for(int i = 0; i < tempArraylength; i++)
		{
			System.out.print(tempArray[i] +" ");
		}
	}
}
