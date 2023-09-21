package javabasics.com;
import java.util.*;

public class SumFun {
	
	public int add(int num1, int num2)
	{
		int sum = num1 + num2;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take two no as input");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		SumFun ref = new SumFun();
		System.out.println(ref.add(num1, num2));
	}
}
