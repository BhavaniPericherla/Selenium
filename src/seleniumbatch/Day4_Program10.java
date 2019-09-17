/*10.Program to create an instance method with return type is any “primitive data type double dimension array” 
and call it from main method and print values on console.*/
package seleniumbatch;

public class Day4_Program10 {
int[][] a={{12,4,5},{6,7,8},{9,10,11}};
int[][] instMethod()
 {
	
	 for(int i=0;i<a.length;i++)
     {
	 for(int j=0;j<a[i].length;j++)
	    {
		 System.out.print(a[i][j]+"\t");
	    }
	 System.out.println();
     }
	return a;
 }
 public static void main(String[] args) 
 {
	 Day4_Program10 ob = new Day4_Program10();
	 ob.instMethod();
}
}
