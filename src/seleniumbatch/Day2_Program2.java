/*2.Write a program to define instance methods with return types int, 
boolean, String and call those methods,
store the returned values in corresponding variables in main method & print the returned values.*/
package seleniumbatch;

public class Day2_Program2 {
	int empNumber()
	{
		return 1;
	}
	boolean result()
	{
		return true;
	}
	String empName()
	{
		return "Bhavani";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day2_Program2 ob1= new Day2_Program2();
		System.out.println(ob1.empNumber());
		System.out.println(ob1.empName());
		System.out.println(ob1.result());
	}

}
