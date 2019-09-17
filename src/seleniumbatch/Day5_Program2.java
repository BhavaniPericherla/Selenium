/*2.	Write programs for the following scenarios:

a. Create a parent class (ex:Parent2) with two instance variables and two instance methods
b. Create a child class (ex:Child2) by inheriting above Parent class and define other two instance methods 
and then call all the parent and child class members in main method*/

package seleniumbatch;

public class Day5_Program2 extends Day5_Parent2 {

	void instM3()
	{
		System.out.println("Parent class instance methoid M1");
	}
	void instM4()
	{
		System.out.println("Parent class instance methoid M2");
	}
	public static void main(String[] args) {
		Day5_Program2 ob = new Day5_Program2();
		System.out.println(ob.instVar1);
		System.out.println(ob.instVar2);
		ob.instM1();
		ob.instM2();
		ob.instM3();
		ob.instM4();
		
	}

}
