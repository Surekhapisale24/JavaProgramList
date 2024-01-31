package javabasics.com;
import java.util.*;
public class TraverseLinkedList
{
	public static void main(String[] args) 
	{
		LinkedList<String> nameList = new LinkedList();
		nameList.add("Suru");
		nameList.add("Shiva");
		nameList.add("Siya");
		nameList.add("Shashwat");
		nameList.add("Nakate");
	
		//print names
		System.out.println("orignal LinkedList: " +nameList);
		
		//traverse elements using iterator
		Iterator it = nameList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//traverse element using for each loop
//		for(String str : nameList)
//		{
//			System.out.println(str);
//		}
		
		//reversed arraylis using for each loop
		LinkedList<String> reversednameList = new LinkedList();
		for(String elements : nameList)
		{
			reversednameList.addFirst(elements);
		}
		System.out.println("reverse LinkedList: " +reversednameList);
	}
}
