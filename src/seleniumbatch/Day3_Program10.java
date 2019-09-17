/*10.	Add any 5 integer values to the array and print those values using for each and for loop as well.*/
package seleniumbatch;

public class Day3_Program10 {

	public static void main(String[] args) {
		int[]array1={10,20,30,40,50};

		

		for(int str:array1)
			System.out.println("For each loop "+str);
		for (int i=0;i<array1.length;i++)
			System.out.println("Normal For Loop"+array1[i]);

	}
}
