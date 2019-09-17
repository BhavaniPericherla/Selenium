//How to Copy One Array to Another in Java  - 4 Types

//Type1:  Manually
/*package seleniumbatch;

public class Day4_Program1_Array4 
{
	public static void main(String[] args) {
		int a[]={10,78,90,21,43};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}*/

package seleniumbatch;
import java.util.Arrays;

public class Day4_Program1_Array4 
{
	public static void main(String[] args) {
		int a[] = {10,7,9,2,3};
/*//Type2:  Arrays.copyOf()
		int b[] = Arrays.copyOf(a,a.length);*/
		
/*//Type3:  System.arraycopy(arg0, arg1, arg2, arg3, arg4);
		int b[] = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);*/
		
/*//Type4:   Object.clone();
		int b[] = new int[a.length];
		b=a.clone();*/

//Type5:     java.util.Arrays.copyOfRange(arg0, arg1, arg2);
		
		int b[] = new int[a.length];
		b = java.util.Arrays.copyOfRange(a,0,a.length);
		//printing b[i] array values
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}	
	}

}


