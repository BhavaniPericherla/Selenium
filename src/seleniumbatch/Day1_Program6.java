/*6.	Write a program to define one instance and one 
static method with return type 'String' and print the returned value in console.*/

package seleniumbatch;

public class Day1_Program6 {
	public String m1()
	{
		return "Bhavani";
		
	}
	public static String m2()
	{
		return "Peri";
		
	}
	public static void main(String[] args) {
		Day1_Program6 obj = new Day1_Program6();
		System.out.println(obj.m1());
		System.out.println(m2());

	}

}
