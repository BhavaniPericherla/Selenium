/*1.	Write a program to declare two instance variables of type 'String' and 
assign the values of local variables to those two instance variables using 'this' keyword.*/
package seleniumbatch;

public class Day2_Program1 {
String inst1;
String inst2;

void getData(String inst1,String inst2) {
	
	this.inst1=inst1;
	this.inst2=inst2;
	System.out.println(inst1);
	System.out.println(inst2);
}
public static void main(String[] args) {
	Day2_Program1 ob1=new Day2_Program1();
	ob1.getData("P", "Bhavani");
}
}
