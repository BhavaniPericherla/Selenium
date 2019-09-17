/*5.	Write a program to define one instance method & one static method by 
returning local variable and print the returned values in console.*/

package seleniumbatch;

public class Day2_Program5 {
    int insMethod()
    {
    	int a= 100;
    	return a;
    }
    static String stMethod()
    {
    	String s ="My Selenium Classes";
    	return s;
    }
	public static void main(String[] args) {
		Day2_Program5 ob = new Day2_Program5();
		System.out.println(ob.insMethod());
		System.out.println(Day2_Program5.stMethod());

	}

}
