/*7. Write a program for the following scenarios:
a. Add 4 string objects (ex: element1, element10, element3, element4) into one ArrayList
b. Add one more string object(ex: element5) in above ArrayList using ListIterator
c. Update the value "element10" with "element2" using ListIterator
d. Delete the value at last position using ListIterator*/

package seleniumbatch;

import java.security.acl.LastOwnerException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Day10_Program7 
{
public static void main(String[] args) 
{
	//a. Add 4 string objects (ex: element1, element10, element3, element4) into one ArrayList
	ArrayList<String> ar = new ArrayList<String>(Arrays.asList("element1", "element10", "element3", "element4"));
	
    //b. Add one more string object(ex: element5) in above ArrayList using ListIterator
	System.out.println("Updated values1: ");
	
	ListIterator<String> itr= ar.listIterator();
    while(itr.hasNext())
    {
	String s=itr.next();
	if(s.equals("element4"))
	{
		itr.add("element5");
	}
	
   }
    System.out.println(ar);
    
    //c. Update the value "element10" with "element2" using ListIterator
    System.out.println("Updated values2: ");
	int pos;
	for(int i=0;i<ar.size();i++)
	{
		pos= ar.indexOf("element10");
	    if(pos>=0)
		ar.set(pos,"element2");
		
	}
	System.out.println(ar);
	
	//d. Delete the value at last position using ListIterator
	
	System.out.println("Updated values3: ");
	int k=ar.size()-1;
	while(itr.hasPrevious()){
		itr.previous();
		if(itr.previousIndex()+1==k){
			itr.remove();
		}				
	}
	System.out.println(ar);	
	  }
}





