package javabasics.com;
import java.util.*;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no as input");
		int num = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		
		System.out.print("fibonacci series " +n1+" "+n2);
		int n3;
		for(int i = 1; i<=num; i++)
		{
		    n3 = n1+n2;
		    System.out.print(" " +n3);
		    n1 = n2;
		    n2 = n3;
		}
		
	}
}
