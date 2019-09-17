/*5. Write a program to add 6 string objects into ArrayList
and display all the data in console using for, for each, Iterator and ListIterator.*/

package seleniumbatch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Day10_Program5 
{
	public static void main(String[] args) 
	{
	ArrayList <String> ar1= new ArrayList<String>();
	ar1.add("Hello1");
	ar1.add("Hello2");
	ar1.add("Hello3");
	ar1.add("Hello4");
	ar1.add("Hello5");
	ar1.add("Hello6");
	// Using for
	System.out.println("Using for Loop : display all the data in console ");
	for(int i=0;i<ar1.size();i++)
		System.out.println(ar1.get(i));
	//Using for each
	System.out.println("Using for each Loop : display all the data in console ");
	for(String ar:ar1)
		System.out.println(ar);
	//Using Iterator
	System.out.println("Using Iterator : display all the data in console ");
	Iterator <String> itr=ar1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//Using ListIterator.
/*	System.out.println("Using ListIterator : display all the data in console ");
	ListIterator <String> lstitr= ar1.listIterator();
	while(lstitr.hasNext())
	{
		System.out.println(lstitr.next());
	}*/
	}
}
