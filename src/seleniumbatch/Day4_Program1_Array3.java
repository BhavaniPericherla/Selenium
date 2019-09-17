/*Example:- adding the objects into Array and printing the objects.*/
package seleniumbatch;
public class Day4_Program1_Array3 {
	 
		public static void main(String[] args)   
		{ 
			int[] a = new int[5];   
			a[0]=111;   
			for (int a1:a)   
			{ System.out.println(a1);   
			}   
			Day4_Program1_Array_Base e1 = new Day4_Program1_Array_Base(111,"ratan");   
			Day4_Program1_Array_Base e2 = new Day4_Program1_Array_Base(222,"anu");   
			Day4_Program1_Array_Base e3 = new Day4_Program1_Array_Base(333,"sravya");   
			Day4_Program1_Array_Base e4 = new Day4_Program1_Array_Base(12);
			Day4_Program1_Array_Base[] e = new Day4_Program1_Array_Base[5];   
			e[0]=e1;   
			e[1]=e2;   
			e[2]=e3;   
			e[3]=e4;
			for (Day4_Program1_Array_Base ee:e)   
			{ 
				System.out.println(ee);  
			}
			for(int i=0;i<e.length;i++)
				System.out.println(e[i]);
			} 
		} 
	
