package javabasics.com;

public class OneToHundredPrimeNo 
{
	public static void main(String[] args)
	{
		System.out.println("1 to 100 prime numbers are: ");
		for(int num = 2; num <= 100; num++)
		{
			boolean isPrime = true;
	        for(int i = 2; i < num/2; i++)
	        {
	            if(num % i == 0)
	            {
	                isPrime = false;
	                break;
	            }
	        }
	        if(isPrime)
    	    {
    	        System.out.print(num +" ");
    	    }
		}
	}
}
