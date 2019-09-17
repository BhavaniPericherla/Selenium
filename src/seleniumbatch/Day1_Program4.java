/*4.	Write a program to declare one instance variable & one static variable of string type with values and 
call those two variables in instance method and print the values in console.*/

package seleniumbatch;

public class Day1_Program4 {
	String instanceVariable1 ="Rohit";
	static String staticVariable1 ="Rama";
	void instanceMethod()
	{ 
		
		System.out.println("InstanceVariable1:"+instanceVariable1 );
        System.out.println("StaticVariable1:"+staticVariable1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1_Program4 ob =new Day1_Program4();
		ob.instanceMethod();
	}

}
