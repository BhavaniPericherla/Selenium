/*10.	Write a program to delegate an object of one class into another class(delegator) 
and call the instance method using delegator class object.*/


package seleniumbatch;
	class classA{

		void Method1()
		{
         System.out.println("Class A Method1");
		}

	}
	class ClassB{
		classA t=new classA();
		void Method1()
		{
			t.Method1(); //Delegation
		}

	}
public class Day5_Program10 
{
		public static void main(String[] args) 
	    {
			ClassB ob=new ClassB();
		ob.Method1();
		}
}

