/*9.	Write a program to declare two instance variables of type 'String' and assign the values 
of local variables to those two instance variables using 'this' keyword.*/
package seleniumbatch;

public class Day1_Program9 {
	String a="abc";
	String b="def";
	public void str(String a,String b){
		System.out.println(a+b); 
		System.out.println(this.a+this.b);	
	}
	public static void main(String args[]){
		
		Day1_Program9 obj=new Day1_Program9();
		obj.str("Bhavani", "baby");	
	}

}
