/*1.Write a program for the following scenarios:
a. Add 5 string objects into one ArrayList
b. Insert one string object at 2nd position
c. Delete the value at 3rd index
d. Update the value at 3rd position with 1st index value
e. Display the value of 4th position in console
f. Display the count of objects available in ArrayList.
*/
package seleniumbatch;
import java.util.ArrayList;
public class Day10_Program1 
{
	public static void main(String[] args) {
		// Option a
		ArrayList <String> ar1= new ArrayList<String>();
		ar1.add("Hello1");
		ar1.add("Hello2");
		ar1.add("Hello3");
		ar1.add("Hello4");
		ar1.add("Hello5");
	
		for(int i=0;i<ar1.size();i++)
			System.out.println(ar1.get(i));
		//option b
		System.out.println("After adding object at 2nd position");
	    ar1.add(1, "Hello6");
	    for(int i=0;i<ar1.size();i++)
			System.out.println(ar1.get(i));
	    //option c
	    System.out.println("Delete the value at 3rd index");
	    ar1.remove(3);
	    for(int i=0;i<ar1.size();i++)
			System.out.println(ar1.get(i));
		//option d
        System.out.println("Update the value at 3rd position with 1st index value");
	    String pos3 = ar1.get(1);
	    ar1.set(2,pos3);
	    for(int i=0;i<ar1.size();i++)
			System.out.println(ar1.get(i));
	    //option e
	    System.out.println("Display the value of 4th position in console");
	    System.out.println(ar1.get(4));
	    //option f
	    System.out.println("Display the count of objects available in ArrayList");
	    System.out.println(ar1.size());
	}

	
	
}
