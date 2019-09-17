/*9. Write a program for the following scenarios:
a. Create one string array with 3 values and convert this array as ArrayList and then print the values from ArrayList individually.
b. Add 4 string objects into one ArrayList and Convert this ArrayList as Array and then print the values from Array individually.
*/
package seleniumbatch;

import java.util.ArrayList;
import java.util.Arrays;

public class Day10_Program9 
{
	public static void main(String[] args) {
		
    //a. Create one string array with 3 values and convert this array as ArrayList and then print the values from ArrayList individually.
	System.out.println("Option a");
    String[] str1= {"bhavani","Pericherla","T"};
    ArrayList<String> ar =new ArrayList<String>(Arrays.asList(str1));
    for(String ar1: ar)
    {
    	System.out.println(ar1);
    }
    
    //b. Add 4 string objects into one ArrayList and Convert this ArrayList as Array and then print the values from Array individually.
    System.out.println("Option b");
    ArrayList<String> ar1 =new ArrayList<String>(Arrays.asList("ary1","ary2","ary4","ary3"));
    String[] str = ar1.toArray(new String[ar1.size()]);
    for(String s : str){  
        System.out.println(s);  
    }  
}
}