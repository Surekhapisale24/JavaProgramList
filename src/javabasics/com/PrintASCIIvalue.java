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
		System.out.println("ASCII value of ch " +ch+ "is: " +asciiVal);
		
		//ascii value of all chars 
//		for(int i=0; i<255; i++)
//		{
//			System.out.println("ASCII value of all character are " +(char)i + " = " +i );
//		}	     
	}
}
