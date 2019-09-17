package seleniumbatch;

class Day4_Program1_Array_Base
{
	int eid;
	String ename;
	Day4_Program1_Array_Base(int i)
	{
		System.out.println(i);
	}
	Day4_Program1_Array_Base(int eid,String ename)
	{
		System.out.println(eid+", "+ename);
		this.eid=eid;
	    this.ename=ename;	
	}
}
