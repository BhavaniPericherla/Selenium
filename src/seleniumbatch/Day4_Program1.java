/*1.Write a java program to declare primitive datatype single dimension array , 
initialized it by passing values and finally print them on console*/

package seleniumbatch;

public class Day4_Program1 {
	public static void main(String[] args) {
		int a[] = new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
			System.out.println("Values of array: "+a[i]);
		}
	}
}
