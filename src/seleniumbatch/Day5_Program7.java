/*7.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1  -> Day5_Parent7a) with two instance methods with return type String
b. Create another class (ex:Parent2 -> Day5_Parent7b ) by inheriting above Parent class (Parent1) and define 
other two instance method with return type int & one static method with return type String
c. Create a child class (ex:Child1 -> Day5_Program7) by inheriting above Parent class(Parent2) and define 
other two instance variables & two instance methods and then call only the above two parent class members using 
parent2 class object in main method.*/

package seleniumbatch;
public class Day5_Program7 extends Day5_Parent7b
{
	int a= 100,b=200;
	void instM5()
	{
		a++;
		System.out.println("instM3: "+a);
	}
	void instM6()
	{
		b++;
		System.out.println("instM4: "+b);
	}
	public static void main(String[] args) 
	{
		Day5_Parent7b obj = new Day5_Program7();
		System.out.println(obj.instM1());
		System.out.println(obj.instM2());
		System.out.println(obj.instM3());
		System.out.println(obj.instM4());	
		System.out.println(obj.stM1()); // best practice is we can call with class name but
		                                //in Program menctioned as use parent2 class object in main method
	}
}
class Day5_Parent7a
{
	String instM1()
	{
		return "Bhavani";
	}
	String instM2()
	{
		return "P";
	}
}
class Day5_Parent7b extends Day5_Parent7a
{
	int instM3()
	{
		return 1;
	}
	int instM4()
	{
		return 2;
	}
    static String stM1()
	{
		return "First inheritance Program";
	}
}