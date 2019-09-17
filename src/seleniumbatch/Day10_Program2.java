/*2. Write a program to add objects of two ArrayLists into another ArrayList.*/

package seleniumbatch;

import java.util.ArrayList;
import java.util.Arrays;

public class Day10_Program2
{
	public static void main(String[] args) 
	{
	ArrayList<String> arList1=new ArrayList<>(Arrays.asList("Str1", "Str2", "Str3","Str4"));
	ArrayList<String> arList2=new ArrayList<>();
	//Approach1:
    /*ArrayList<String> arList2=new ArrayList<>(arList1);
     * for(int i=0;i<arList2.size();i++)
		System.out.println(arList2.get(i));*/
	//Approach2:
	arList2.addAll(arList1);
	for(int i=0;i<arList2.size();i++)
		System.out.println(arList2.get(i));
	}
}
