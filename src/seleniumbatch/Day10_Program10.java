/*10. Write a program to add first 10 integers in ArrayList using for loop and Delete all the integers 
except even numbers from the ArrayList and then print the ArrayList having even numbers in console.*/
package seleniumbatch;

import java.util.ArrayList;

public class Day10_Program10 
{
	public static void main(String[] args) 
	{
		int initialSize = 10;
		ArrayList<Integer> number = new ArrayList<Integer>(initialSize);
		for (int i = 0; i < initialSize; i++)
		 {
		   number.add(i);
		   System.out.println(number.get(i));
		 }
		
		System.out.println("Even Numbers");
		for (int i=0;i<number.size();i++){      
		       int even=number.get(i)%2;       
		        if (even==0){
		            System.out.println(number.get(i));
		            number.remove(i);
		        }    
		    }
   
	}
}
