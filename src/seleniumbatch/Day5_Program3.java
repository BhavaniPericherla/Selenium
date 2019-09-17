/*3.Write programs for the following scenarios:
a. Create a parent class (ex:Day5_Parent3) with two static variables and one instance & static methods
b. Create a child class (ex:Child3:Day5_Program3) by inheriting above Parent class and define other two 
instance methods with return type String and then call all the parent and child class members in main method*/

package seleniumbatch;

public class Day5_Program3 extends Day5_Parent3{
	String instM3()
	{
		return "Bhavani";
	}
	String instM4()
	{
		return "Surya";
	}
	public static void main(String[] args) {
		Day5_Program3 ob = new Day5_Program3();
		System.out.println("Instance Method of Child class:"+ob.instM3());
		System.out.println("Instance Method of Child class: "+ob.instM4());
		Day5_Parent3.staticM1();
		ob.instm1();
		System.out.println("Static veriable1 of Parent Class :"+Day5_Parent3.staticVar1);
		System.out.println("Static veriable2 of Parent Class :"+Day5_Parent3.staticVar2);
	}
}
