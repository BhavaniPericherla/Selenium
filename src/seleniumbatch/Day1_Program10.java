/*10.	Write a program to define two instance methods with parameters and call those two methods in main method.*/
package seleniumbatch;

public class Day1_Program10 {
	void instanceParamM1(int a)
	{ 
		System.out.println("Values of a: "+a);
	}
	void instanceParamM2(int c,int d)
	{ 
		System.out.println("Values of c+d:"+(c+d) );
	}
	public static void main(String[] args) {
		Day1_Program10 obj = new Day1_Program10();
		obj.instanceParamM1(10);
		obj.instanceParamM2(100, 11);
	}
}
