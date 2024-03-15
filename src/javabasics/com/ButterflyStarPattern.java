package javabasics.com;
import java.util.*;
public class ButterflyStarPattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			for(int j = 1; j<=2*(num-i); j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = num; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			for(int j = 1; j<=2*(num-i); j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
