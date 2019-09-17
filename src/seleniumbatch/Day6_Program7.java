/*7.Write programs for the following scenarios:
a. Create a parent class (ex:Parent1 - > Parent2) with one instance method having int var-args.
b. Create a child class (ex:Child1) by inheriting above Parent class and overload the same instance method of 
above parent class with single int parameter and then call the method with all possible reference types.
c. Create a child class (ex:Child2 - > Day6_Program7) by inheriting above Parent class and override the same 
instance method of above parent class and then call the method with all possible reference types.*/

package seleniumbatch;
class Parent2
{
	void inst(int... i)
	{
		System.out.println("It is var-args Method");
	}
}
class Child1 extends Parent2
{
	void inst(int i)
	{
		System.out.println("It is int 1 arg Method"+i);
	}
	
}
public class Day6_Program7 extends Child1
{
	void inst(int i)
	{
		System.out.println("It is short 1 arg Method"+i);
	}
	    public static void main(String[] args) {
		/*Child1 obj = new Child1(); // child class object
		obj.inst(12);
		obj.inst('a');
		obj.inst((short)1);
		obj.inst(1,2,3,4,5);*/
	    Day6_Program7 obj1 = new Day6_Program7(); 
		obj1.inst(12);
		obj1.inst((char)1);
		obj1.inst('a');
		obj1.inst((short)1);
		obj1.inst((byte)1);
		obj1.inst(1,2,3,4,5);
	    obj1.inst((byte)1,(byte)12.4,(byte)13.4,(byte)144.4,(byte)15.6);  
		obj1.inst((short)1.1,(short)1.3,(short)1,(short)1,(short)1); 
		obj1.inst((char)1.1,(char)1.3,(char)1,(char)1,(char)1); 
	}
}
