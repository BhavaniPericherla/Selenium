// finding null  index values.  
//To get the class name of the array:

package seleniumbatch;


public class Day4_Program1_Array5 
{
public static void main(String[] args) 
{
	String a[]=new String[4];
	a[0]="Bhavani";
	a[1]="Surya";
	a[2]="Kumari";
	a[3]=null;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==null)
		{
			// finding null  index values.  
			System.out.println("Null value at "+i+" index is ");			
			System.out.println(a[i]);
		}
	}
	//To get the class name of the array:
	System.out.println(a.getClass().getName());
}
}
