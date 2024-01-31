package javabasics.com;
import java.util.*;
public class SearchEleAnArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList();
		al.add("Suru");
		al.add("Shiva");
		al.add("Siya");
		al.add("Shashwat");
		al.add("Nakate");
		
		String searchname = "Shiva";
		if(al.contains(searchname))
		{
			System.out.println("Specific name found in the Arraylist : " +searchname);
		}
		else
		{
			System.out.println("Element not found in ArrayList");
		}
	}
}
