package arrays.com;
import java.util.*;
public class FindMinMaxArrayListEle 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> EleList = new ArrayList();
		EleList.add(200);
		EleList.add(2000);
		EleList.add(460);
		EleList.add(500);
		EleList.add(450);
		EleList.add(20);
		
		int min = Collections.min(EleList);
		int max = Collections.max(EleList);
		
		System.out.println("min value of arraylist is: " +min);
		System.out.println("max value of arraylist is: " +max);
	}
}
