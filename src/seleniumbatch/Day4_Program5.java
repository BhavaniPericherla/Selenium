/*5. Write java programs by following below steps:
   Step1 : Create employee class with following details:  class Name: Employee,  employee details:  
           emp_ID, emp_Name, emp_dept  and Initialize these three variables with parametrized constructor
   Step2:  Create one more class and declare single dimension array with data type is Employee, 
           initialize it by passing employee objects.
   Step3:  print all employee detail by iterating this array.*/

package seleniumbatch;
class Employee
{
	int emp_ID;
	String emp_Name,emp_dept;
	Employee(int emp_ID,String emp_Name,String emp_dept)
	{
		this.emp_dept=emp_dept;
		this.emp_ID=emp_ID;
		this.emp_Name=emp_Name;
	}
}

public class Day4_Program5 
{   
	public static void main(String[] args) {
		Employee a[] = {new Employee(1,"Bhavani","QA"), new Employee(2,"P","Developer")};
		for (int i = 0; i < a.length; i++) {
			System.out.println("Employee of "+i+ "th position details");
			System.out.print(a[i].emp_ID+" ");
			System.out.print(a[i].emp_Name+" ");
			System.out.print(a[i].emp_dept+" ");
			System.out.println();
		}
	}
}
