package collection.com;
import java.util.*;
public class TraverseArrayListEle 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> Al = new ArrayList();
		Al.add(12);
		Al.add(18);
		Al.add(78);
		Al.add(56);
		Al.add(34);
		Al.add(23);
		
		System.out.println("ArrayList elements printing using for each loop: ");
		//using for each loop
		for(int elements : Al)
		{
			System.out.println(elements);
		}
		
		System.out.println("ArrayList elements printing using iterator: ");
		//using Iterator
		Iterator it = Al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
