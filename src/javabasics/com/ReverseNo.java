package javabasics.com;
import java.util.*;
public class ReverseNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take any no as input");
		int num = sc.nextInt();
		int reverse = 0;
		int reminder = 0;
		while(num!=0) 
		{
			reminder = num%10;
			reverse = reverse*10+reminder;
			num = num/10;
		}
		System.out.println("reverse number is " +reverse);	
	}
}
