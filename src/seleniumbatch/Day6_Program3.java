/*3.	Write a program to define 2 instance methods and 2 static methods with same name 
and two arguments and then call all the 4 methods in main method.*/

package seleniumbatch;

public class Day6_Program3 
{
	public void sum(int x,int y)
	{
		System.out.println("int sum is: "+(x+y));
	}
	public void sum(float x,float y)
	{
		System.out.println("float sum is: "+(x+y));
	}
	public static void sum(double x,double y)
	{
		System.out.println("double sum is: "+(x+y));
	}
	public static void sum(String x,String y)
	{
		System.out.println("int sum is: "+(x+y));
	}
	public static void main(String[] args) 
	{
		Day6_Program3 obj = new Day6_Program3();
		obj.sum(10, 20);
		obj.sum(10.2f, 30.2f);
		Day6_Program3.sum(80.5, 20.5);
		Day6_Program3.sum("Rohit", "Krishna");
	}
}
