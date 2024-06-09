<<<<<<< HEAD
package strings.com;
import java.util.*;
public class UniqueCharsFrmString 
{
	public static void main(String[] args)
	{
		System.out.print("Unique chars from given Strings are: ");
		uniqueChars("ccrert");
		
		
		System.out.print("Duplictate chars from given Strings are: ");
		duplicateChars("ccrert");
	}
	
	public static void uniqueChars(String str)
	{
		char charArray[] = str.toCharArray();
		int count;
		
		for(int i = 0; i < str.length(); i++)
		{
			count = 1;
			for(int j = i+1; j <str.length(); j++)
			{
				if(charArray[i] == charArray[j] && charArray[i] != ' ')
				{
					count++;
				}
			}
			
			if(count == 1)
			{
				System.out.print(charArray[i]);
			}
		}
		System.out.println();
	}
	
		
		public static void duplicateChars(String str)
		{
			char charArray[] = str.toCharArray();
			int count;
			
			for(int i = 0; i < str.length(); i++)
			{
				count = 1;
				for(int j = i+1; j <str.length(); j++)
				{
					if(charArray[i] == charArray[j] && charArray[i] != ' ')
					{
						count++;
					}
				}
				
				if(count > 1)
				{
					System.out.print(charArray[i]);
				}
			}
	}
}
=======
package strings.com;
import java.util.*;
public class UniqueCharsFrmString 
{
	public static void main(String[] args)
	{
		System.out.print("Unique chars from given Strings are: ");
		uniqueChars("ccrert");
		
		
		System.out.print("Duplictate chars from given Strings are: ");
		duplicateChars("ccrert");
	}
	
	public static void uniqueChars(String str)
	{
		char charArray[] = str.toCharArray();
		int count;
		
		for(int i = 0; i < str.length(); i++)
		{
			count = 1;
			for(int j = i+1; j <str.length(); j++)
			{
				if(charArray[i] == charArray[j] && charArray[i] != ' ')
				{
					count++;
				}
			}
			
			if(count == 1)
			{
				System.out.print(charArray[i]);
			}
		}
		System.out.println();
	}
	
		
		public static void duplicateChars(String str)
		{
			char charArray[] = str.toCharArray();
			int count;
			
			for(int i = 0; i < str.length(); i++)
			{
				count = 1;
				for(int j = i+1; j <str.length(); j++)
				{
					if(charArray[i] == charArray[j] && charArray[i] != ' ')
					{
						count++;
					}
				}
				
				if(count > 1)
				{
					System.out.print(charArray[i]);
				}
			}
	}
}
>>>>>>> f2790413607f1564c3f59586ff7cf86213ef9a0d
