/*6.	Write a program to define one instance method by returning instance variable using this keyword 
and print the returned value in console.*/

package seleniumbatch;

public class Day2_Program6 {
	String a= "100% Java Selenium Classes";
	 String insMethod()
	    {
	    	
	    	return this.a;
	    }

	public static void main(String[] args) {
		
		Day2_Program6 ob = new Day2_Program6();
        System.out.println(ob.insMethod());
        
	}

}
