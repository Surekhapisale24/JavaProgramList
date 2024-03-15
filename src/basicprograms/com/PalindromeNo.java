package basicprograms.com;
import java.util.*;
public class PalindromeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number as input");
		int num = sc.nextInt();
		int rem = 0; 
		int rev = 0; 
		int temp = num;
		while(temp != 0)
		{
			rem = temp %10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(num == rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}
}
