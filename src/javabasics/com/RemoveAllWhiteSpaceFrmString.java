package javabasics.com;
import java.util.*;
public class RemoveAllWhiteSpaceFrmString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input");
		String str = sc.nextLine();
		String opStr = str.replaceAll("\\s", "");
		System.out.println("String without space is: " +opStr);
	}
}
