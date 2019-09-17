/*11. Program to print Double dimension array values in the matrix format.*/

package seleniumbatch;

public class Day4_Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{12,4,5},{6,7,8},{9,10,11}};
		for(int i=0;i<a.length;i++)
	     {
		 for(int j=0;j<a[i].length;j++)
		    {
			 System.out.print(a[i][j]+"\t");
		    }
		 System.out.println();
	     }
	}

}
