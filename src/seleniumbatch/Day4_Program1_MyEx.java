/*//Encapsulation Example1 -The fields of a class can be made read-only 
by writing a public getter but no public setter. */

package seleniumbatch;

public class Day4_Program1_MyEx {

	private int empId = 101;
	private String empName = "Sri Ram";
	private int empAge = 13;
	public int getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpAge()
	{
		return empAge;
	}
    private void setEmpId(int newValue)
	{
		empId=newValue;
	}
    private void setEmpName(String newValue)
	{
		empName=newValue;
	}
    private void setEmpAge(int newValue)
	{
		empAge=newValue;
	}
	public static void main(String[] args) {
		Day4_Program1_MyEx ob1= new Day4_Program1_MyEx();
		ob1.setEmpId(0001);
		ob1.setEmpName("Bhavani");;
		ob1.setEmpAge(25);
		System.out.println("Employee Name: " + ob1.getEmpName());
        System.out.println("Employee Id: " + ob1.getEmpId());
        System.out.println("Employee Age: " + ob1.getEmpAge());
        

	}

}
