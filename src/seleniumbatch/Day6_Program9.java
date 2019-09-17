/*9.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1 -> Parent3) and declare two instance variables of type String with values 
assigned
b. Create a child class (ex:Child1 ->Day6_Program9) by inheriting above Parent class and declare same two instance 
variables of type String with different values assigned and define one instance method with two String 
parameters and print the values of all variables such as local, instance & parent class variables inside this 
instance method,finally call the instance method in main method.(note:all the variable names should be same).*/

package seleniumbatch;
class Parent3
{
	String s1="Shanvitha",s2="Rohit";
}

public class Day6_Program9 extends Parent3
{
	String s1="Baby",s2="Bhavani";
	void inst(String s1,String s2)
	{
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(this.s1);
		System.out.println(this.s2);
		System.out.println(super.s1);
		System.out.println(super.s2);
	}
	public static void main(String[] args) {
		Day6_Program9 obj = new Day6_Program9();
		obj.inst("Rama","Raju");
	}
}
