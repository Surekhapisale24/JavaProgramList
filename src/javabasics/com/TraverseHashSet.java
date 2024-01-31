package javabasics.com;
import java.util.*;
public class TraverseHashSet
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet();
		set.add("surekha");
		set.add("surekha");
		set.add("shivaji");
		set.add("nakate");
		
		System.out.println("orignal set:" +set);
		
		//traverse set
		for(String str : set)
		{
			System.out.println(str);
		}
		
		HashSet<String> newSet = new HashSet();
		newSet.add("suru");
		newSet.add("shiva");
		newSet.add("nakate");
		//System.out.println("orignal set:" +newSet);
		
		//only one method will use at time retainAll() or addAll()
	
//		set.retainAll(newSet); //this method will show common elements from both sets
//		System.out.println("after reatining two sets: " +set);
		
		set.addAll(newSet); //this will add all elements both set unique elements add only once
		System.out.println("after adding two sets: " +set);
		
	}
}
