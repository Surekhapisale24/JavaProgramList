package strings.com;
public class RemoveVowelsFrmStr
{
	public static void main(String[] args) 
	{
		String str = "Test Automation Center";
		String Vowel = "aeiouAEIOU";
		String result = "";
		
		for(char ch : str.toCharArray())
		{
			if(Vowel.indexOf(ch) == -1)
			{
				result = result + ch;
			}
		}
		System.out.println("after removing the vowels string is: " +result);
	}
}
