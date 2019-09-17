/*7.Program to declare double dimension array and assign the values dynamically*/

package seleniumbatch;

public class Day4_Program7 
{
void getArray(int a[][])
{
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	Day4_Program7 ob =new Day4_Program7();
	ob.getArray(new int[][]{{1,2,3},{4,5,6}});
}
}
