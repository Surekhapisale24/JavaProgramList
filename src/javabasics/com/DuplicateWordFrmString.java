package javabasics.com;
import java.util.*;
public class DuplicateWordFrmString
{
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("take the user input");
		   // int num = sc.nextInt();
		    String str = sc.nextLine();
		    str = str.toLowerCase();
		    
		    String[] words = str.split("[\\s,.!?]+");
		    boolean[] isDuplicate = new boolean[words.length];
		    
		    for(int i = 0; i < words.length; i++)
		    {
		        if(!isDuplicate[i])
		        {
		            for(int j = i + 1; j < words.length; j++)
		            {
		                if(words[i].equals(words[j]))
		                {
		                    isDuplicate[j] = true;
		                    
		                    //small
		                }
		            }
		        }
		    }
		    
		    System.out.println("duplicate words from string: ");
		    for(int i = 0; i < words.length; i++)
		            {
		                if(isDuplicate[i])
		                {
		                    System.out.println(words[i]);
		                }
		            }
	}
}
