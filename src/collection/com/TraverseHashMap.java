package collection.com;
import java.util.*;
public class TraverseHashMap
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> map = new HashMap();
		map.put("suru", 27);
		map.put("shiva", 30);
		map.put("siya", 0);
		map.put("shashwat", 0);
		
		System.out.println("orignal hashmap: " +map);
		
		//traverse hashmap
		for(String key : map.keySet())
		{
			System.out.println("key: " +key+ ", value: " +map.get(key));
		}
	}
}
