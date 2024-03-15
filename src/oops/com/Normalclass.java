package oops.com;

public class Normalclass 
{
	public static void main(String[] args)
	{
		Normalclass NC = new Normalclass();
		NC.add();
		NC.sub();
	}
	
	
	//Implemaintation of abstract method 
	public void add()
	{
		System.out.println("add method from abstract class implementing from normal class");
	}
	
	public void sub()
	{
		System.out.println("sub from normal class");
	}
}
