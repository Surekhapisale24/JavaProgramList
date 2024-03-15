package patterns.com;
import java.util.*;
public class RectanglePattern
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
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
