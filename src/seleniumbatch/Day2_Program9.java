/*9.	Write programs for the following scenarios:
a.	Create a class (ex: Test5) with two instance variables of type 'String' and one instance method.
b.	Create another class(ex: Test6) with one instance method by passing above class (Test5) object as 
parameter and call the instance members of 'Test5' class in instance method.
*/
//Consider Test6 as Day2_Program9

package seleniumbatch;

class Test5
{
	String st01= "TestNG",st02 = "Frame Work";
	void instMethod1()
	{
		System.out.println("Instance Method1 in Test5");
	}
}
public class Day2_Program9 {
	void loginMethod(Test5 ob){

		System.out.println("login1 instance method with object as parameter");

		ob.instMethod1();

		System.out.println(ob.st01);
		System.out.println(ob.st02);
		

	}

	public static void main(String[] args) 
	{
		Day2_Program9 ob1= new Day2_Program9();
      
		ob1.loginMethod(new Test5());
	
	}

}
