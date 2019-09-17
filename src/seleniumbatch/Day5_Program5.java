/*5.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1: Day5_Parent5a) with one instance & one static variable and one instance & 
one static method
b. Create another class (ex:Parent2 : Day5_Parent5) by inheriting above Parent class (Parent1) and 
define other one instance method with return type boolean & one static method
c. Create a child class (ex:Child1  : Day5_Program5) by inheriting above Parent class(Parent2) and 
define other two instance methods and then call all the parent & child class members in main method.*/
package seleniumbatch;
public class Day5_Program5 extends Day5_Parent5
{
	void instM3()
	{
		int locVar1=in_var1+1;
		System.out.println("method instM3:"+locVar1);
	}
	void instM4()
	{
		int locVar2=in_var1+1;
		System.out.println("method instM4:"+locVar2);
	}
	public static void main(String[] args) 
	{
		Day5_Program5 obj=new Day5_Program5();
		System.out.println(Day5_Parent5a.st_var1);
		System.out.println(obj.in_var1);
		obj.instM1();
		obj.p5_instM2();
		Day5_Parent5.p5_StaticM3();
		Day5_Parent5a.StaticM2();
		obj.instM3();
		obj.instM4();
		
	}
}
