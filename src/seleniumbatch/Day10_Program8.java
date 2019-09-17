/*8. Write a program for the following scenarios:
a. Add 7 string objects into one ArrayList
b. Display all the objects in ascending order
c. Display all the objects in descending order using 2 possible approaches.*/

package seleniumbatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Day10_Program8 
{
public static void main(String[] args) 
{
	//a. Add 7 string objects into one ArrayList
	ArrayList<String> ar = new ArrayList<String>(Arrays.asList("str7","str3","str2","str4","str5","str6","str1"));
	
	//b. Display all the objects in ascending order
    Collections.sort(ar);
	System.out.println("Updated Value1: "+ar);
	
	//c. Display all the objects in descending order using 2 possible approaches.*/

	//Aproach1:
    Collections.sort(ar,Collections.reverseOrder());
	System.out.println("Updated Value2\n  - > Aproach1: "+ar);
	
	//Aproach2:
	Collections.reverse(ar);
	System.out.println("Updated Value2\n  - > Aproach1: "+ar);
	
}

}
