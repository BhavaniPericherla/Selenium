/*6. Write a program to add 3 string objects into Vector and 
display all the data in console using all possible ways.*/

package seleniumbatch;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Day10_Program6 
{
public static void main(String[] args) {
	Vector<String> vstr = new Vector<String>();
	vstr.add("smile1");
	vstr.add("smile2");
	vstr.add("smile3");
	vstr.add("smile4");
	vstr.add("smile5");
	//By using Enumeration
	System.out.println("By using Enumeration: ");
	Enumeration<String> en =vstr.elements();
	while(en.hasMoreElements())
	{
		System.out.println(en.nextElement());
	}
	//By using for loop
	System.out.println("By using for loop: ");
	for(int i=0;i<vstr.size();i++)
	{
		System.out.println(vstr.get(i));
	}
	//By using for Each Loop
	System.out.println("By using for Each Loop: ");
	for(String str:vstr)
	{
		System.out.println(str);
	}
	//By using Iterator
	System.out.println("By using Iterator: ");
	Iterator <String> itr = vstr.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	//By using ListIterator
	System.out.println("By using ListIterator");
	
	ListIterator<String> lstitr = vstr.listIterator();
	while(lstitr.hasNext())
	{
		System.out.println(lstitr.next());
	}
}
}
