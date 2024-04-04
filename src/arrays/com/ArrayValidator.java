package arrays.com;

public class ArrayValidator 
{
	public static void main(String[] args)
	{
		Object[] array = new Object[] {1,2,3,4,"str", null};
		
		//Object[] array = new Object[0];
		//Object[] array = null;
		
		
		boolean isValid = validateArray(array);
		
		if(isValid)
		{
			System.out.println("Array is valid");
		}
		else
		{
			System.out.println("Array is invalid");
		}
	}
	
	public static boolean validateArray(Object[] array)
	{
		if(array == null || array.length == 0)
		{
			return false;
		}
		return true;
	}
}
