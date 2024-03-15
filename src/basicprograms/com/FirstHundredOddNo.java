package basicprograms.com;
public class FirstHundredOddNo
{
	public static void main(String[] args)
	{
		int number = 100;
		System.out.println("first hundred 100 odd numbers: ");
		for(int i = 0; i<number; i++)
		{
			if(i%2 != 0)
			{
				System.out.print(i +" ");
			}
		}
	}
}
