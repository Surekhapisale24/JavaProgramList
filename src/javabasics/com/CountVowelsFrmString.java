package javabasics.com;
import java.util.*;
public class CountVowelsFrmString 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take the user input");
		String str = sc.nextLine();
		
		int vowelCount = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowelCount++;
			}
		}
		
		System.out.println("number of vowels from given string are: " +vowelCount);
	}
}
