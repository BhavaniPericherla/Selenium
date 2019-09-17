/*process of adding different types  Objects in Object array */

package seleniumbatch;
class Emp
{
	Emp(int a,String s)
	{
		System.out.println("Employee class: "+a+", "+s);
	}
}
class Student
{
	Student(int a,String s)
	{
		System.out.println("Student class: "+a+", "+s);
	}
}
public class Day4_Program1_Array6 
{
	public static void main(String[] args) 
	{
		 Object[] ob = new Object[7];
		 ob[0] = new Emp(10,"Bhavani");
		 ob[1] = new Integer(10);
		 ob[2] = new String("String is class");
		 ob[3] = new Student(100,"Rohit");
	
		System.out.println("Calling values in Objects");
		 for(Object o:ob)
		 {   if(o instanceof Emp)
			     new Emp(111,"Vani");
		     if(o instanceof Integer)
		    	 System.out.println(o);
		     if(o instanceof String)
		         System.out.println(o);
		     if(o instanceof Student)
		    	 new Student(100,"Rohit");
		     if(o == null)
		    	 System.out.println(o); 
		 }
	}
}
