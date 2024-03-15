package strings.com;
import java.util.*;
public class SaparateCharactersFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string as input");
		String str = sc.nextLine();
		String alpha = "";
		String digit = "";
		String spcl = "";
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(isAlphabet(ch))
			{
				alpha = alpha+ch;
			}
			else if(isDigit(ch))
			{
				digit = digit+ch;
			}
			else
			{
				spcl = spcl+ch;
			}
		}
		System.out.println("alphabets are :"+alpha);
		System.out.println("digits are :"+digit);
		System.out.println("spcl are :"+spcl);
	}
	

	private static boolean isDigit(char ch) {
		// TODO Auto-generated method stub
		return ch >= '0' && ch <= '9';
	}

	private static boolean isAlphabet(char ch) {
		// TODO Auto-generated method stub
		return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
				
	}
		
}
