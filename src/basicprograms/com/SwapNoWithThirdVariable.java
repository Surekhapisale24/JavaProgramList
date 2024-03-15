package basicprograms.com;
import java.util.*;
public class SwapNoWithThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("take two numbers from user input");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int temp = 0;
		System.out.println("n1 and n2 before swap :" +n1+ " " +n2);
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("n1 and n2 after swap :" +n1+ " " +n2);
	}
}
