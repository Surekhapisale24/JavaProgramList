package javabasics.com;
import java.util.*;
public class StringAnagram
{
	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 		System.out.println("take the user input");
    
        String str1 = "Listen";
        String str2 = "Silent";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
       char[] chArray1 = str1.toCharArray();
       char[] chArray2 = str2.toCharArray();
       
       if(str1.length() != str2.length())
       {
           System.out.println("String is not anagram 1");
           System.exit(0);
       }
       
       Arrays.sort(chArray1);
       Arrays.sort(chArray2);
       boolean temp = true;
       for(int i = 0; i < chArray1.length; i++)
       {
           if(chArray1[i] != chArray2[i])
           {
               System.out.println("String is not Anagaram 2");
               temp = false;
               System.exit(0);
               
           }
       }
       if(temp == true )
       {
           System.out.println("Given String is Anagram");
       }
       
	}
}
