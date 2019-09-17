/*3.Write a java program by following the same steps in the second program and additionally add piece of 
code to  assign your own values to array and print them on console*/
package seleniumbatch;

public class Day4_Program3 
{
	public static void main(String[] args) 
    {
    	int[] anArray; 
        anArray = new int[5];
        anArray[0] = 10;
        anArray[1] = 20;
        anArray[2] = 30;
        anArray[3] = 40;
        anArray[4] = 50;
      
        for(int i=0;i<anArray.length;i++)
        {
        System.out.println(anArray[i]);
        }
	}
}
