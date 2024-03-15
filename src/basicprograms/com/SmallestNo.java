package basicprograms.com;
import java.util.*;
public class SmallestNo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("take the 3 numbers as user input");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int smallest = 0;
		
		if(n1<n2 && n1<n3)
		{
			smallest = n1;
		}
		else if(n2<n1 && n2<n3)
		{
			smallest = n2;
		}
		else
		{
			smallest = n3;
		}
		System.out.println("smallest number is: " +smallest);
	}
}
