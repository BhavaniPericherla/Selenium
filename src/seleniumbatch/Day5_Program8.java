/*8.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1 -> Day5_Parent8a) with two instance methods
b. Create a child class (ex:Child1 -> Day5_Program8) by inheriting above Parent class and define the same two 
instance methods 
of above parent class and call the parent & child class methods in main method.
*/
package seleniumbatch;

public class Day5_Program8 extends Day5_Parent8a
{
	void instM1()
	{
	System.out.println("child class Method : instM1");
	}
	void instM2()
	{
		System.out.println("child class Method : instM2");
	}
	public static void main(String[] args) {
		Day5_Program8 childob = new Day5_Program8();
		childob.instM1();
		childob.instM2();
		Day5_Parent8a parentob = new Day5_Parent8a();
		parentob.instM1();
		parentob.instM2();
	}
}
