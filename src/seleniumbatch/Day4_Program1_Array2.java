/*Finding minimum & maximum element of the array:-*/ 
package seleniumbatch;

public class Day4_Program1_Array2 
{
	public static void min(int a[])
	{
		//Java Program to demonstrate the way of passing an array  
		//to method. Part1
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
			
		}
		System.out.println("Minimum value of an array: "+min);
	}
	public static void max(int a[])
	{
	int max =a[0];
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println("Maximum value of an array: "+max);
	}
public static void main(String[] args)   
{ 
/*	int[] a = new int[]{10,20,95,70,4};   
	
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(min>a[i])
		min=a[i];
		
	}
	System.out.println("Minimum Value of array:  "+min);
	int max=a[0];
	for(int i= 1;i<a.length;i++)
	{
		if(max<a[i])
		max=a[i];
	}
	System.out.println("Maximum Value of array:  "+max);
	*/
	//Java Program to demonstrate the way of passing an array  
	//to method. Part2

	int a1[]={21,44,54,10,1,23,32};
	for(int i=0;i<a1.length;i++)
	{
	System.out.println(a1[i]);
	}
	min(a1);
	max(a1);
}
}	
