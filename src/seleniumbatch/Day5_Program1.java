/*1.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with two instance methods
b. Create a child class (ex:Child1) by inheriting above Parent class and define other two instance methods 
and then call all the parent and child class methods in main method*/

// Consider Child1 as "Day5_Program1"

package seleniumbatch;

public class Day5_Program1 extends Day5_Parent1{
	void childM1(){
		System.out.println("Child class instance methoid M1");
	}
	void childm2()
	{
		System.out.println("Child class instance methoid M2");
	}
	public static void main(String[] args) {
		
		Day5_Program1 ob = new Day5_Program1();
		ob.ParentM1();
		ob.ParentM2();
		ob.childM1();
		ob.childm2();
		

	}

}
