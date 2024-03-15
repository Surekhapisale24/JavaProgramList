package arrays.com;
import java.util.*;
public class ManipulateArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList();
		al.add(12);
		al.add(24);
		al.add(36);
		al.add(48);
		al.add(56);
		al.add(72);
		
		System.out.println("Orognal ArrayList: " +al);
		
		al.add(4,60);
		System.out.println("ArrayList after manipulating : " +al);
		al.remove(5);
		System.out.println("ArrayList after manipulating : " +al);
		
	}
}
