package patterns.com;
import java.util.*;
public class PascalsTrianglePattern 
{
	public static void main(String[] args)
	{
		//	System.out.println("Hello World");
		    Scanner sc = new Scanner(System.in);
		    System.out.println("take user input");
		    int num = sc.nextInt();
		    int number = 1;
		    for(int i = 1; i<=num ; i++)
		    {
		        for(int j = 1; j<=num-i; j++)
		        {
		            System.out.print(" ");
		        }
		        
		        number = 1;
		        for(int j = 1 ; j<=i; j++)
		        {
		            System.out.print(number +" ");
		            number = number*(i-j)/(j);
		        }
		        System.out.println();
		  }
	}
}
