package basicprograms.com;
import java.util.*;
public class EvenOddNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take any no as input");
		int num = sc.nextInt();
		if(num%2 == 0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
}
