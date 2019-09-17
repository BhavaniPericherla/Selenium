/*12. Write a program to add all String objects from one ArrayList to other LinkedList without using 
addAll() and then print the objects of LinkedList in console.*/

package seleniumbatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Day10_Program12 
{
	public static void main(String[] args) 
	{
    ArrayList<String> ar = new ArrayList<String>(Arrays.asList("sel1","sel2","sel3","sel4","sel5"));
    LinkedList<String> lstr =new LinkedList<String>(ar);
    System.out.println(lstr);
	}
}
