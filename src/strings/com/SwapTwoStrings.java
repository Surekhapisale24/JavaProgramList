package strings.com;
import java.util.*;
public class SwapTwoStrings
{
	public static void main(String[] args)
	{
		String s1 = "suru";
		String s2 = "shiva";
		
		//Swap String using temp var
//		String temp ;
//		temp = s1;
//		s1 = s2;
//		s2 = temp;
//		
//		System.out.println("after swapping string :" +s1 +" " +s2);
		
		//Swap two strings without using thirs var
		
		System.out.println("String before swap");
		System.out.println("s1 : " +s1);
		System.out.println("s2 : " +s2);
		 
		s1 = s1 + s2; // concat two Strings len = 9
		s2 = s1.substring(0, s1.length() - s2.length()); // s1 = 9, s2 = 5 ,s2 = 9-5 = 4
		s1 = s1.substring(s2.length());
		
		System.out.println("String after swap");
		System.out.println("s1 : " +s1);
		System.out.println("s2 : " +s2);
	}
}
