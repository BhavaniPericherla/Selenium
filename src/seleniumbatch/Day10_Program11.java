/*11. Write a program for the following scenarios:
a. Add 4 string objects into one LinkedList
b. Add one object at first position and last position
c. Delete the object at 3rd position
d. Update the value at 4th position with 2nd index value*/

package seleniumbatch;

import java.util.LinkedList;

public class Day10_Program11 {

	public static void main(String[] args) 
	{
		//a. Add 4 string objects into one LinkedList
		LinkedList<String> lstr =new LinkedList<String>();
		lstr.add("Session1");
		lstr.add("Session2");
		lstr.add("Session3");
		lstr.add("Session4");
		System.out.println("Option a: "+lstr);
		
		//b. Add one object at first position and last position
		lstr.addLast("SessionLast");
		lstr.addFirst("SessionFirst");
		System.out.println("Option b: "+lstr);
		
		//c. Delete the object at 3rd position
		for(int i=0; i<lstr.size();i++)
		{
			if(i==2)
			{
				lstr.remove(i);
			}
			String a=lstr.get(i);
		}
		System.out.println("Option c: "+lstr);
	}

}
