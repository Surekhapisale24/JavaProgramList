package javabasics.com;
import java.util.*;
public class NthPrimeNo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take the nth no as input ");
		int nthNo = sc.nextInt();
		int number = 1; int count = 0;
		int i;
		while(count < nthNo)
		{
			number = number+1;
			for(i=2; i<=number; i++)
			{
				if(number % i == 0)
				{
					break;
				}
			}
			if(i == number)
			{
				count++;
			}
		}
		System.out.println( +nthNo +" th prime no is: " +number );
	}
}
