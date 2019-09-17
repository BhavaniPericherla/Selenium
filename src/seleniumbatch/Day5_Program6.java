/*6.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1 : Day5_Parent6a) with one instance & one static variable of type String 
and one instance & one static method with return type String
b. Create another class (ex:Parent2 : Day5_Parent6b) by inheriting above Parent class (Parent1) and define 
other one instance method with return type int & one static method with return type String
c. Create a child class (ex:Child1) by inheriting above Parent class(Parent2) and define other two instance 
variables & two static methods and then call all the parent & child class members in main method.*/

package seleniumbatch;

public class Day5_Program6 extends Day5_Parent6b
{
	int a= 100,b=200;
	static void StaticM3()
	{
		System.out.println("StaticM3");
	}
	static void StaticM4()
	{
		System.out.println("StaticM4");
	}
	public static void main(String[] args) 
	{
		Day5_Program6 obj = new Day5_Program6();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(Day5_Parent6a.name);// class Day5_Parent6a static variable
		System.out.println(obj.ins_desig);// class Day5_Parent6a instance variable
		/*System.out.println(Day5_Parent6a.StaticM1());// class Day5_Parent6a static method
		System.out.println(Day5_Parent6b.StaticM2());// class Day5_Parent6b static method
		*/
		System.out.println(obj.instM1());
		System.out.println(Day5_Program6.StaticM1());// calling static method defined with another class with child class name
		System.out.println(obj.instM2());
		System.out.println(Day5_Program6.StaticM2());// calling static method defined with another class with child class name
		Day5_Program6.StaticM3();
		Day5_Program6.StaticM4();
	}
}
class Day5_Parent6a
{
	String ins_desig = "IT";
	static String name = "Shanvitha";
	String instM1()
	{
	
		return "Surya";
	}
	static String StaticM1()
	{
		return "Mother";
	}
}


class Day5_Parent6b extends Day5_Parent6a
{
	int instM2()
	{
	
		return 1;
	}
	static String StaticM2()
	{
		return name;
	}
}