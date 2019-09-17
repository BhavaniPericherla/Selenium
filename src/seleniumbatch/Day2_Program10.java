/*10.	Write programs for the following scenarios:
a.	Create a class (ex: Test7) with two instance variables of type 'String' and one instance method with 
return type 'boolean'.
b.	Create another class(ex: Test8) with one static method by passing above class (Test7) 
object as parameter and call the instance members of 'Test7' class in instance method.
*/
//Note: consider Test8 is Day2_Program10
package seleniumbatch;
class Test7
{
	String instVar="Practice make man perfect";
	String instVar1="Sri Ram";
boolean instMethod()
{
	boolean locvar;
	if(instVar.equals(instVar1))
	{
		locvar=true;
	}
	else
		locvar=false;
	return locvar;
}
}
public class Day2_Program10 {
	static void method1(Test7 obj)
	{
		System.out.println(obj.instMethod());
		System.out.println(obj.instVar);
		System.out.println(obj.instVar1);
	}

	public static void main(String[] args) {
		
		Day2_Program10.method1(new Test7());

	}

}
