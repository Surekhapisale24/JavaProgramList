package javabasics.com;
import java.util.*;
public class CountSpaceFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string as input");
		String str = sc.nextLine();
		int count = 0; 
		char ch  = ' ';
		for(int  i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				count++;
			}
		}
		System.out.println("number of spaces in given String are : "+count);

	}
}
