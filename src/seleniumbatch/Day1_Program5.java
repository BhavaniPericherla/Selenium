/*5.	Write a program to declare one instance variable & one static variable of string type with values 
and call those two variables in static method and print the values in console.*/

package seleniumbatch;

public class Day1_Program5 {
	String instanceVariable1 ="Instance Variable";
	static String staticVariable1 ="static variable";
public static void main(String[] args) {
	Day1_Program5 obj = new Day1_Program5();
	System.out.println(obj.instanceVariable1);
	System.out.println(staticVariable1);
}
}
