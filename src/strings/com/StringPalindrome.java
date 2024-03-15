package strings.com;
import java.util.*;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take any string as input");
		String str = sc.nextLine();
		String rev = "";
		//int length = str.length();
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}	
		if(str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is  not palindrome");
		}
	}
}
