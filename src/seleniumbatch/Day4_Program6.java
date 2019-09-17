/*6.Program declare double dimension array and initialize by passing values directly.*/
package seleniumbatch;
public class Day4_Program6 
{
	
	public static void main(String[] args) 
	{
		int arr[][] = { {10,20,30},{15,25,35},{22,44,66},{33,55,77} };
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr[i].length;j++)
		{
		System.out.print(arr[i][j]+" ");
	
		}
		System.out.println();
	    }
     }

}
