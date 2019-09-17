
/*5.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with two instance methods
b. Create a child class (ex:Child1) by inheriting above Parent class and define the same two instance methods 
of above parent class and call only the child class methods using parent class reference in main method.*/

//Overridding

package seleniumbatch;
class Parent 
{
	public void getData(double a)
	{
		System.out.println("Parent - method with double parameter "+a);
	}
	public void getData(short a)
	{
		System.out.println("Parent - method with short parameter "+a);
	}
}
public class Day6_Program5 extends Parent
{
	public void getData(double a)
	{
		System.out.println("Child - method with double parameter "+a);
	}
	public void getData(short a)
	{
		System.out.println("Child - method  with short parameter "+a);
	}
	public static void main(String[] args) {
		Parent obj = new Day6_Program5();
		obj.getData((short)10.848);
		obj.getData((short)10);
		obj.getData(29993.5849489);
	}
}
