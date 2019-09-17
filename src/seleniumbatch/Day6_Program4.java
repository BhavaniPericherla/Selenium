/*4.	Write a program to define 2 instance methods with same name and one argument of type double & 

short respectively and call the method with all possible types of values as parameter.*/
package seleniumbatch;
public class Day6_Program4 
{  
	public void getData(double a)
	{
		System.out.println("getData method with double parameter "+a);
	}
	public void getData(short a)
	{
		System.out.println("getData method with short parameter "+a);
	}
	public static void main(String[] args) 
	{
		Day6_Program4 obj = new Day6_Program4();
		
		obj.getData(20);
		/*obj.getData((short)'a');
		obj.getData((short)-20);
		obj.getData((short)10.98f);
		obj.getData((short)10.98);
		obj.getData(10);
		obj.getData(-222);
		obj.getData('a');
		obj.getData(10.98f);
		obj.getData(102.9849);
		obj.getData((byte)1);
		obj.getData((long)10.98);
		*/
	}

}
