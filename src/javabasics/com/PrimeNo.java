package javabasics.com;
import java.util.*;
public class PrimeNo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no as input");
		int num = sc.nextInt();
		int temp = 0;
		for(int i=2; i<=num; i++)
		{
			if(num%2 == 0)
			{
				temp = temp+1;
			}
		}
		if(temp == 0)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
}
