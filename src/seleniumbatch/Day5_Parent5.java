/*5.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1: Day5_Parent5a) with one instance & one static variable and one instance & 
one static method
b. Create another class (ex:Parent2 : Day5_Parent5) by inheriting above Parent class (Parent1) and 
define other one instance method with return type boolean & one static method
c. Create a child class (ex:Child1  : Day5_Program5) by inheriting above Parent class(Parent2) and 
define other two instance methods and then call all the parent & child class members in main method.*/

package seleniumbatch;
class Day5_Parent5a 
{
	static int st_var1=1;
	int in_var1=1;
	void instM1()
	{
		System.out.println("Instance Variable: "+in_var1);
	}
	static void StaticM2()
	{
		System.out.println("Static Method in parent class: "+st_var1);
	}
}

public class Day5_Parent5 extends Day5_Parent5a
{
	boolean p5_instM2()
	{
		in_var1++;
		System.out.println("Instance Variable of parent class accessing in child class :"+in_var1);
		return true;
	}
	static void p5_StaticM3()
	{
		st_var1++;
		System.out.println("Static variable in parent class accessing in child class"+st_var1);
	}
}