/*1.Write a program to define 3 instance methods with same name and different 
number of arguments and then call all the 3 methods in main method.*/

package seleniumbatch;

public class Day6_Program1 {
	public void getdata(){
		System.out.println("getdata method without parameters...");
	}
	public void getdata(String locator){
		System.out.println("getdata method with 1 parameter...");
	}
	public void getdata(String locator, String type){
		System.out.println("getdata method with 2 parameters...");
	}
	public static void main(String[] args) {
		Day6_Program1 obj=new Day6_Program1();
		obj.getdata();
		obj.getdata("Bhavani");
		obj.getdata("Bhavani", "001");
	}
}
