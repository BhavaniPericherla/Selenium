/*3. Write a program to store the list of objects from 1st index to 
4th index from one ArrayList to another ArrayList*/
package seleniumbatch;

import java.util.ArrayList;
import java.util.Arrays;


public class Day10_Program3 
{
public static void main(String[] args) 
{
	ArrayList<String> arList1=new ArrayList<>(Arrays.asList("Str1", "Str2", "Str3","Str4","Str5","Str6"));
	ArrayList<String> arList2=new ArrayList<>(arList1.subList(1, 5));
	System.out.println("First Array List");
	System.out.println(arList1);
	System.out.println("Second Array List");
	System.out.println(arList2);
}
}
