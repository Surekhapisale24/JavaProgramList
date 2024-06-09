<<<<<<< HEAD
package strings.com;
import java.util.*;
public class InputBoxAcceptOnlyChar
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input");
		String inputStr = sc.nextLine();
		boolean isValid = validateString(inputStr);
		
		if(isValid)
		{
		    System.out.println("String is valid");
		}
		else
		{
		    System.out.println("Stirng is not valid");
		}
	}
	
	public static boolean validateString(String str)
	{
	    for(char c : str.toCharArray())
	    {
	        if(!Character.isLetter(c) && !Character.isWhitespace(c))
	        {
	            return false;
	        }
	    }
	    return true;
	}
}
=======
package strings.com;
import java.util.*;
public class InputBoxAcceptOnlyChar
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input");
		String inputStr = sc.nextLine();
		boolean isValid = validateString(inputStr);
		
		if(isValid)
		{
		    System.out.println("String is valid");
		}
		else
		{
		    System.out.println("Stirng is not valid");
		}
	}
	
	public static boolean validateString(String str)
	{
	    for(char c : str.toCharArray())
	    {
	        if(!Character.isLetter(c) && !Character.isWhitespace(c))
	        {
	            return false;
	        }
	    }
	    return true;
	}
}
>>>>>>> f2790413607f1564c3f59586ff7cf86213ef9a0d
