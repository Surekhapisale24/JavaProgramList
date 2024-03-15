package basicprograms.com;
import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no as input");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("factorial of given number is "+fact);
	}
}


// string str = "Surekha Shvaji Nakate";
// "   nakate   "
// 1. String reverse
// 2. string palindrome
// 3. count spaces, count characters, count words, splits, duplicate character, duplicate words, 
// 4. last words length, insert string at position, duplicate delete char/ words,  

//Array
//search element in array, sort array, find the grater value in array 






