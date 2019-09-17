/*3.	Write a program to define one instance method and one static method 
and call those two methods in main method.*/

package seleniumbatch;

public class Day1_Program3 {
	void login1()
	{ 
		//instance method
		System.out.println("Instance method invoked");

	}

	static void login2(){ 
		//static method

		System.out.println("static method invoked");

	}
	public static void main(String[] args){
	Day1_Program3 obj = new Day1_Program3();

	obj.login1(); // calling instance method by using object name

	Day1_Program3.login2(); // calling static method by using class name
	}
}
