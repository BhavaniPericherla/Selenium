package seleniumbatch;

public class Day4_Program3_MyEx1 extends Day4_Program3_MyEx{
	void m1()
	{
		System.out.println(a);
		a++;
	}
	public static void main(String[] args) {
		Day4_Program3_MyEx1 ob =new Day4_Program3_MyEx1();
		ob.m1();
		
		Day4_Program3_MyEx1 ob1 =new Day4_Program3_MyEx1();
		ob1.m1();
	}
}
