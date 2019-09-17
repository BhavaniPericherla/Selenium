/*2.	Write a program to define 3 static methods with same name 
and single argument and then call all the 3 methods in main method.*/

package seleniumbatch;
public class Day6_Program2 
{
		public static void getdata(double x)
		{
			System.out.println("double getdata is: "+(x));
		}

		public static void getdata(float x)
		{
			System.out.println("float getdata is: "+(x));
		}

		public static void getdata(int x)
		{
			System.out.println("int getdata is: "+(x));
		}


		public static void main(String[] args) 
		{
			Day6_Program2.getdata(10);
			Day6_Program2.getdata(10.12f);
			Day6_Program2.getdata(40.66);
	    }

}
