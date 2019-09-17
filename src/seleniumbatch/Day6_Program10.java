/*10.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1 -> Parent4) and define one instance method
b. Create a child class (ex:Child1) by inheriting above Parent class and override the same method and define 
other instance method and call the overriding & overridden methods inside this method and then invoke this new 
instance method in main method.*/

package seleniumbatch;

class Parent4
{
	void inst1()
	{
		System.out.println("Parent instance method");
	}
}
public class Day6_Program10 extends Parent4
{
	void inst1()
	{
		System.out.println("child instance method");
	}
	void inst2()
	{
		inst1();
		super.inst1();
	}
	public static void main(String[] args) {
		Day6_Program10 obj = new Day6_Program10();
		obj.inst2();
	}
}
