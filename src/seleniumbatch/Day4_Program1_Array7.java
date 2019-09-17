// multi dimensional array:

package seleniumbatch;

public class Day4_Program1_Array7 
{
public static void main(String[] args) 
{
	int a[][]=new int[2][2];
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{    
			 count =count+1;  // Assigning values to array
			 a[i][j] = count; 
			// System.out.print(a[i][j]+" "); //Printing values in console 
		}
		//System.out.println();//new line
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{    
			System.out.print(a[i][j]+" ");  
		}
		 System.out.println();//new line
	}
	
}
}
