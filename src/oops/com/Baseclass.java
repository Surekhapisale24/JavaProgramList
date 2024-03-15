package oops.com;

public class Baseclass
{
	public static void main(String[] args) 
	{
		//Inheritance
		InheritanceChildclass Int = new InheritanceChildclass();
		Int.property();
		Int.marry();
		
		// Shape Interface implemantation using Circle class
		Circle c = new Circle();
		c.draw();
		
	}
	
	public void property()
	{
		System.out.println("taking all property of my parent");
	}
	
	public void marry()
	{
		System.out.println("marry with Katrina");
	}
}
