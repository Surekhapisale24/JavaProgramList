package basicprograms.com;

public class PrintOneToHunPrimeNo 
{
	public static void main(String[] args)
	{
		//int num = 100;
		System.out.println("1 to 100 prime number are: ");
		for(int num = 2; num <=100; num++)
		{
			boolean isPrime = true;
			for(int i = 2; i <= num / 2 ; i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime && num != 1)
			{
				System.out.print(" "+num);
			}
		}
	}
}
