package basicprograms.com;
import java.util.*;
public class PerfectSqaureOrNot 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take user input");
		double number = sc.nextDouble();
		if(checkPerfectSquare(number))
		{
			System.out.println("number is perfect Square");
		}
		else
		{
			System.out.println("number is not perfect Square");
		}
		
	}
	static boolean checkPerfectSquare(double number)
	{
		for(int i = 1; i*i<=number; i++)
		{
			if(number % i == 0 && number/i == i)
			{
				return true;
			}
		}
		
		return false;	
	}
}
