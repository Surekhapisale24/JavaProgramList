package javabasics.com;
import java.util.*;
public class CountTheNumOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Take user input");
		int num = sc.nextInt();
		
		int NumberOfDgits = String.valueOf(num).length();
		System.out.println("Number of digits are in given number are :"+NumberOfDgits);
	}
}
