package strings.com;
import java.util.*;
public class ReplaceStrUpCasetoLoCaseViseVersa
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input");
		String str = sc.nextLine();
		StringBuffer newStr = new StringBuffer(str);
		
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String after case conversation:" +newStr);
	}
}
