/*7.	Write a program to define two instance methods & one static method 
 * and call those two instance methods in static method.*/

package seleniumbatch;

public class Day1_Program7 {
	public String instanceM1()
	{
		return "instanceM1";
		
	}
	public String instanceM2()
	{
		return "instanceM2";
		
	}
	public static String staticM1()
	{
		Day1_Program7 ob1= new Day1_Program7();
		System.out.println(ob1.instanceM1());
		System.out.println(ob1.instanceM2());
		return "staticM1";
	}
	public static void main(String[] args) {
		System.out.println(Day1_Program7.staticM1());
	}
}
