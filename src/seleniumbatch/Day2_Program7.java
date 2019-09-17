/*7.	Write programs for the following scenarios: 
a.	Create a class (ex: Test1) with two instance variables of type 'String' and one instance method.
b.	Create another class(ex: Test2) with one instance method by returning above class (Test1) object and 
call the instance members using returned object in main method.*/
//
//Note:consider class name Test2 as "Day2_Program7"
package seleniumbatch;
class Test1
{
	String st1 = "Surya";
	String st2 = "Kumari";
	String m1()
	{
		return "Bhavani";
	}
}
 public class Day2_Program7 {
	   
		Test1 m2()
		{
			Test1 ob1 = new Test1();
			return ob1;
		}
	public static void main(String[] args) {
		Day2_Program7 t2=new Day2_Program7();
		Test1 ob1 = t2.m2();
		System.out.println(ob1.st1+ob1.st2);
		System.out.println(ob1.m1());
	}
}
