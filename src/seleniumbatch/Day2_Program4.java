/*4.	Write a program to define one instance method with return type boolean & one static method with 
return type String and call those methods, store the returned values in corresponding 
variables in main method & print the returned values.*/
package seleniumbatch;

public class Day2_Program4 {
	  boolean Method1()
	    {
	    	return true;
	    }
	 static String stMethod()
	 {
		 return "Shanvitha";
	 }
		
	public static void main(String[] args) {
		
		Day2_Program4 ob1 = new Day2_Program4();
        boolean b =ob1.Method1();
        System.out.println(b);
        String s= Day2_Program4.stMethod();
        System.out.println(s);
  

}
}
