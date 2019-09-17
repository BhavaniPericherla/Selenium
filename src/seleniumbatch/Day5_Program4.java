/*4.	Write programs for the following scenarios:

a. Create a parent class (ex:Parent4) with two instance variables and one instance & static methods
b. Create a child class (ex:Child4) by inheriting above Parent class and define other one instance method 
with return type boolean and then call all the possible members using parent class object in main method*/

package seleniumbatch;
public class Day5_Program4 extends Day5_Parent4
{
	boolean instM2()
	{
		System.out.println("Instance Variable1:"+inst1);
		return true;
	}
	public static void main(String[] args) {
		Day5_Parent4 ob1 = new Day5_Parent4();
		System.out.println("Sum of variabes in Parent class: "+(ob1.inst1+ob1.inst2));
		ob1.instM1();
		ob1.StaticM2();
		// we are unable to use child class method because we did not created object to child class
	}
	
}
class Day5_Parent4 {
int inst1=10,inst2=20;
void instM1()
{
	System.out.println("Instance Method M1 in parent class");
}
static void StaticM2()
{
	System.out.println("Static Method in parent class");
}

}