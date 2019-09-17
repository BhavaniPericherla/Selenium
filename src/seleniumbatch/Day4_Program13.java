/*13. program to take double dimension array and swap  first and last position values of middle row.
Note:
// Java Program to Interchange any two Rows & Columns in the given Matrix - Dynamically
*/

package seleniumbatch;

import java.util.Scanner;

public class Day4_Program13 
{
    public static void main(String[] args) 
    {
        try 
        {
			int noOfRows, noOfColms, interchangeValue, x , y, temp = 0;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter number of rows in matrix > 1:");
			noOfRows = s.nextInt();
			System.out.print("Enter number of columns in matrix > 1:");
			noOfColms = s.nextInt();
			int a[][] = new int[noOfRows][noOfColms];
			System.out.println("Enter all the elements of matrix:");
			for (int i = 0; i < noOfRows; i++) 
			{
			    for (int j = 0; j < noOfColms; j++) 
			    {
			        a[i][j] = s.nextInt();
			    }
			}
			System.out.println("Given Matrix:");
			for (int i = 0; i < noOfRows; i++) 
			{
			    for (int j = 0; j < noOfColms; j++) 
			    {
			        System.out.print(a[i][j] + " ");
			    }
			    System.out.println("");
			}
			while(true) 
			{
			    System.out.println("Enter 1 to interchange rows position values");
			    System.out.println("Enter 2 to interchange columns position values");
			    System.out.println("Enter 3 to Exit");
			    interchangeValue=s.nextInt();
			    switch (interchangeValue) 
			    {
			        case 1:
			        System.out.println("Enter 2 row numbers<="+noOfRows);
			        x = s.nextInt();
			        y = s.nextInt();
			        for(int i = 0; i < noOfRows; i++)
			        {
			            temp = a[(x-1)][i];
			            a[x-1][i] = a[y-1][i];
			            a[y-1][i] = temp;
			        }
			        System.out.println("Matrix after interchanging rows:"+x +" and "+y);
			        for (int i = 0; i < noOfRows; i++) 
			        {
			            for (int j = 0; j < noOfColms; j++) 
			            {
			                System.out.print(a[i][j] + " ");
			            }
			        System.out.println("");
			        }
			        break;
			        case 2:
			        System.out.println("Enter 2 column numbers<="+noOfColms);
			        x = s.nextInt();
			        y = s.nextInt();
			        for(int i = 0; i < noOfRows; i++)
			        {
			            temp = a[i][(x-1)];
			            a[i][x-1] = a[i][(y-1)];
			            a[i][y-1] = temp;
			        }
			        System.out.println("Matrix after interchanging columns:"+x +" and "+y);
			        for (int i = 0; i < noOfRows; i++) 
			        {
			            for (int j = 0; j < noOfColms; j++) 
			            {
			                System.out.print(a[i][j] + " ");
			            }
			        System.out.println("");
			        }
			        break;
			  	case 3:
			        System.exit(0);
			    
			    }
			}
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Exception : Array out of boundry");
		}
    }
}
