package javabasics.com;
import java.util.*;
public class HollowRectanglePattern 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input as n and m");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=m; j++)
			{
				if(i==1 || j==1 || i==n || j==m)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
