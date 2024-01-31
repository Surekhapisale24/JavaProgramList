package javabasics.com;
public class CountNumOfWordsinStr 
{
	public static void main(String[] args) 
	{
		String str = "Test Automation Center" ;
		String strArray[] = str.split("\\s+");
		System.out.println("number of words in given String are: " +strArray.length);
		
//		String str2 = "Guide to intraday trading and Learn Tock market";
//		String strArray2[] = str2.split(" ");
//		System.out.println("number of words in given String are: " +strArray2.length);
	}
}
