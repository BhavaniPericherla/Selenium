/*Write a program to declare two instance variables and two static variables of string 
type with values and print the values of those variables in console. */

package seleniumbatch;

public class Day1_Program2 {
	String instanceVariable1 ="Rohit";
	String instanceVariable2 ="Shanvitha";
	static String staticVariable1 ="Rama";
	static String staticVariable2 ="Sita";
public static void main(String[] args) 
{
	Day1_Program2 Obj =new Day1_Program2();
	
	System.out.println("InstanceVariable1:   "+Obj.instanceVariable1);
	System.out.println("InstanceVariable2:   "+Obj.instanceVariable2);
	System.out.println("StaticVariable1:     "+staticVariable1);
	System.out.println("StaticVariable2      "+staticVariable2);
	
}
}

