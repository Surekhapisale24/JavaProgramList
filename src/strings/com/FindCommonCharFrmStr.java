package strings.com;
import java.util.*;
public class FindCommonCharFrmStr 
{
	public static void main(String[] args) 
	{
		String str1 = "abcdes";
		String str2 = "asdfer";
		String str3 = "asdavc";
		
		String common = "";
		
		for(char ch : str1.toCharArray())
		{
			if(str1.indexOf(ch) != -1 && str2.indexOf(ch) != -1 && str3.indexOf(ch) != -1)
			{
				common = common + ch;
			}
		}
		
		System.out.println("common characters: " +common);
	}
}
