/*8.	Write programs for the following scenarios: 
a.	Create a class (ex: Test3) with two instance variables of type 'int' and one instance method 
with return type 'String'.
b.	Create another class(ex: Test4) with one static method by returning above class (Test3) 
object and call the instance members using returned object in main method.*/

// consider "Test4" as Day2_Program8
package seleniumbatch;

class Test3
{
	int a=10,b=20;
    String StMethod1()
    {
    	return "Rohit Krishna";
    }
    
}
public class Day2_Program8 
{
	static Test3 StMethod1()
    {
		Test3 ob = new Test3();
	    System.out.println("StMethod1");
    	return ob;
    }

	public static void main(String[] args) 
	{
		
	//	Test3 t3 = StMethod1(); //Direct accessing. 
		Test3 t3 = Day2_Program8.StMethod1();//By using class name. 
		
		//By using reference variable. mens objectName.method

		System.out.println(t3.a);
		System.out.println(t3.b);
		System.out.println(t3.StMethod1());
	}

}

    
	

