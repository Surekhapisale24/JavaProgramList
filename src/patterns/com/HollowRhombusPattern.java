package patterns.com;
import java.util.*;
public class HollowRhombusPattern 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input n amd m ");
		int n = sc.nextInt();
		//int m = sc.nextInt();
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j<=n; j++)
			{
				if(i==1 || j==1 || i==n || j==n)
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
