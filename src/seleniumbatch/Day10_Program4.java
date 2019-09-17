/*4. Write a program for the following scenarios:
a. Delete all the objects from fist ArrayList that are contained in second ArrayList
b. Delete all the objects from fist ArrayList that are NOT contained in second ArrayList*/

package seleniumbatch;

import java.util.ArrayList;
import java.util.Arrays;

public class Day10_Program4 
{
	public static void main(String[] args) 
	{	
	//a. Delete all the objects from first ArrayList that are contained in second ArrayList
	ArrayList<String> arList1=new ArrayList<>(Arrays.asList("Str1", "Str2", "Str3","Str4","Str5","Str6"));
	ArrayList<String> arList2=new ArrayList<>(Arrays.asList("Str1", "Str2", "Str3","Str7","Str8","Str9"));
	if(arList1.removeAll(arList2))
	 System.out.println(arList1);
	//b. Delete all the objects from fist ArrayList that are NOT contained in second ArrayList*/
	    ArrayList<String> b1=new ArrayList<>(Arrays.asList("Str1", "Str2", "Str3","Str4","Str5","Str6"));
		ArrayList<String> b2=new ArrayList<>(Arrays.asList("Str1", "Str2", "Str3","Str7","Str8","Str9"));
        if(b1.retainAll(b2))
	    System.out.println(b1);
	}
}
