package javabasics.com;
import java.util.*;
public class NumberHalfPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no n as input");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}
