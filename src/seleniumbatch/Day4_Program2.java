/*2.Write a java program to declare single dimension array, initialized it
with some array size and print the default values on console.*/

package seleniumbatch;

public class Day4_Program2 
{
	
    public static void main(String[] args) 
    {
    	int[] anArray; 
        anArray = new int[10];
        for(int i = 0;i<anArray.length;i++)
        {
        	System.out.println(anArray[i]);
        }
        
	}
}
