//Constructor Examples :Relationship between parent and child class constructor

package seleniumbatch;
class BaseConst
{
	BaseConst()
	{
		System.out.println("BaseConst");
	}
	BaseConst(int i)
	{
		System.out.println(i);
	}
	}
public class Day7_Program1 extends BaseConst
{
	Day7_Program1()
	{
		System.out.println("Child const");
	}
	public static void main(String[] args) 
	{
		Day7_Program1 objChild =new Day7_Program1();
		BaseConst b=new BaseConst(100);
	}
}
