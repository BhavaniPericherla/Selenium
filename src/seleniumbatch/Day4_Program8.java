/*8.Program to Print  middle row data from double dimension array.*/
package seleniumbatch;

public class Day4_Program8 
{
	int row=0,col=0;
public static void main(String[] args) 
{
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	int row =a.length;
	int col=a[0].length;
	System.out.println("Number of Rows "+row+"\nNumber of columns "+col);
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	// This prints the mid row
	   if((row%2)!=0 )
	   {
	     int midNumber = (row-1)/2;
	         System.out.println("Mid Row is");
	         for(int k=0; k<col; k++)
	         {
	             System.out.print(a[midNumber][k]+ "  ");
	         }
	   }
	   // This prints the mid column
	   if((col%2)!=0)
	   {
	     int midNumber = (col-1)/2;
	        System.out.println("\nMid Column is");
	        for(int k=0; k<row; k++)
	        {
	          System.out.print(a[k][midNumber]+ " ");
	        }
        }
}
}
