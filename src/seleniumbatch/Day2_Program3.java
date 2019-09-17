/*3.Write a program to define static methods with return types int, boolean, String and call those methods, 
store the returned values in corresponding variables in main method & print the returned values.
package ob1;*/
package seleniumbatch;
public class Day2_Program3 {
	static int empNumber()
	{
		return 1;
	}
	static boolean result()
	{
		return true;
	}
	static String empName()
	{
		return "Bhavani";
	}
	public static void main(String[] args) {
		int eno = Day2_Program3.empNumber();
		System.out.println(eno);
		String enm = Day2_Program3.empName();
		System.out.println(enm);
		boolean b =  Day2_Program3.result();
		System.out.println(b);
	}

}