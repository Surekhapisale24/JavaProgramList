package javabasics.com;
import java.util.*;
public class ReplaceSpaceWithSpecificChar 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input");
		String str = sc.nextLine();
		System.out.println("enter a specific char");
		char ch = sc.next().charAt(0);
		
		String newStr = str.replace(' ', ch);
		System.out.println("after replacing space with specific char: " +newStr);
	}
}
