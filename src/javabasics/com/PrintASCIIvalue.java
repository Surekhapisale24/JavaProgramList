package javabasics.com;
import java.util.*;
public class PrintASCIIvalue 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input");
		char ch = sc.next().charAt(0);
		int asciiVal = ch;
		System.out.println("ASCII value of single char " +ch+ " is: " +asciiVal);
		
		//ascii value of all chars 
//		for(int i=0; i<255; i++)
//		{
//			System.out.println("ASCII value of all character are " +(char)i + " = " +i );
//		}	 
		
		//print ASCII values using for each loop
		String str = "Test Automation Center";
		for(char ch1 : str.toCharArray())
		{
			System.out.println("ASCII value of each char is: " +ch1 +" " +(int)ch1);
		}
	}
}
