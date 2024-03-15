package javabasics.com;
import java.util.*;
public class InvertedHalfPyramidwithNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take number as input from user");
		int num = sc.nextInt();
		for(int i = num; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	
	}
}


//
//for(int i = num; i>=1; i--)
//{
//	for(int j = 1; j<=i; j++)
//	{
//		System.out.print(i);
//	}
//	System.out.println();
//}

//		int number = 0;
//		for(int i = num; i>=1; i--)
//		{
//			number++;
//			for(int j = 1; j<=i; j++)
//			{
//				System.out.print(number);
//			}
//			System.out.println();
//		}

