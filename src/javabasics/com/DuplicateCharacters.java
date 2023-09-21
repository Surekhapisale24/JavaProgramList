package javabasics.com;
import java.util.*;
public class DuplicateCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take the String as user input");
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();
		System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(charArray[i] == charArray[j])
				{
					System.out.print(charArray[j] + " ");
		            break;
				}
			}
		}
	}
}
