package basicprograms.com;
import java.util.*;
public class SwapNo {
	public void swapTwoNoWithoutThirdVar(int num1, int num2) 
	{
		num1 = num1 + num2; //12+24 = 48
		num2 = num1 - num2; //48-24 = 12
		num1 = num1 - num2; //48-12 = 24
	
		System.out.println("value of num1 is " +num1+ " value of num2 is "+num2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take two no as input");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		SwapNo swap = new SwapNo();
		swap.swapTwoNoWithoutThirdVar(num1, num2);
	}
}
