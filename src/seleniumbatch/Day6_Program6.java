/*6.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with one instance method having default modifier, return type String
b. Create a child class (ex:Child1 -> Day6_Program6) by inheriting above Parent class and override the same 
instance method of above parent class with all possible access modifiers.
(note: comment previous method if there are more possibilities)*/

package seleniumbatch;
class Parent1
{
	String inst()
	{
		return "Bhavani";
	}
}
public class Day6_Program6 extends Parent1
{
	/*String inst()
	{
		return "Raju";
	}*/
	/*protected String inst()
	{
		return "Bhavani";
	}*/
	public String inst()
	{
		return "Child: ROHIT KRISHNA";
	}
	
	public static void main(String[] args) 
	{
		Day6_Program6 obj = new Day6_Program6();
		System.out.println(obj.inst());
	}

}
