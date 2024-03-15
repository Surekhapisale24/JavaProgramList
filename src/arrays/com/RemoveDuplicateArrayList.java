package arrays.com;
import java.util.*;
public class RemoveDuplicateArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> duplicateEle = new ArrayList();
		duplicateEle.add("one");
		duplicateEle.add("one");
		duplicateEle.add("Two");
		duplicateEle.add("Two");
		duplicateEle.add("Three");
		
		System.out.println(duplicateEle);
		Set<String> set = new HashSet<> (duplicateEle);
		ArrayList<String> WithoutDuplicateEle = new ArrayList(set);
		System.out.println(WithoutDuplicateEle);
		
//		Set<String> set1 = new HashSet<> (duplicateEle);
//		duplicateEle.clear();
//		duplicateEle.addAll(set1);
//		System.out.println(set1);
	}
}
