///*//Encapsulation Example2 : To achieve write only by writing public setter and no public getter.


package seleniumbatch;

public class Day4_Program2_MyEx2 {

	private int empId1;
	private String empName1;
	private int empAge1;
	private int getempId1()
	{
		return empId1;
	}
	private String getempName1()
	{
		return empName1;
	}
	private int getempAge1()
	{
		return empAge1;
	}
    public void setempId1(int newValue)
	{
		empId1=newValue;
	}
    public void setempName1(String newValue)
	{
		empName1=newValue;
	}
    public void setempAge1(int newValue)
	{
		empAge1=newValue;
	}
	public static void main(String[] args) {
		Day4_Program2_MyEx2 ob1= new Day4_Program2_MyEx2();
		ob1.setempId1(0001);
		ob1.setempName1("Bhavani");;
		ob1.setempAge1(25);
		System.out.println("Employee Name: " + ob1.getempName1());
        System.out.println("Employee Id: " + ob1.getempId1());
        System.out.println("Employee Age: " + ob1.getempAge1());
        

	}

}
