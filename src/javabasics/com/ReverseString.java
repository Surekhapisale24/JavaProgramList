package javabasics.com;
import java.util.*;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the any string as input");
		String str = sc.nextLine();
		String rev = "";
		int length =  str.length();
		for(int i=length-1; i>=0; i--)
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("reverse of string is "+rev);
	}
}
