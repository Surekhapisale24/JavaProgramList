package javabasics.com;
import java.util.*;
class CountEachCharOccurenceFrmStr
{
	public static void main(String[] args) 
	{
		
		 int countArray[] = new int[256];
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String");
	        String str = sc.nextLine();
	        
	        for(int i = 0; i<str.length(); i++)
	        {
	            countArray[(int)str.charAt(i)]++;
	        }
	    
	        for(int i =0; i<256; i++)
	        {
	            if(countArray[i] != 0)
	            {
	                System.out.println("char occurence: " +(char)i +" "+countArray[i]);
	            }
	        }
//		String str = "SuREreTffdgdtEERR";
//		//take  counter array of ASCII values
//		
//		int countArray[] = new int[256];
//		
//		for(char c : str.toCharArray())
//		{
//			countArray[c]++;
//		}
//		
//		for(int i = 0; i<countArray.length; i++)
//		{
//			if(countArray[i]>0)
//			{
//				System.out.println("char Occures " +(char)i +" "+  +countArray[i] +" times");
//			}
//		}
	}
}
