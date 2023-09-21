package javabasics.com;
public class LargestNo 
{
	public static void main(String[] args) {
		{
			int n1 = 54;
			int n2 = 56;
			int n3 = 34;
			int largest = 0;
			
			if(n1 > n2 && n1 > n3)
			{
				largest = n1; 
			}
			
			else if(n2 > n1 && n2 > n3)
			{
				largest = n2; 
			}
			
			else 
			{
				largest = n3; 
			}
			System.out.println("largest no is " +largest);		
		}
	}
}
