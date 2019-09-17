/*8.	Write programs to inherit the parent class and override the instance method by using covariant 
 * return type and then call the method with all the 3 possible reference types.*/

package seleniumbatch;
//other classes with inheritance
class SignIn{	
void signin_m1()
{
	System.out.println("Sign in");
}
}
class Search extends SignIn{
	void search_m1()
	{
		System.out.println("search");
	}
}
//parent class

class OverrideParent{

	SignIn m1(){
		System.out.println("Parent m1 method");
		return new SignIn();
	}
}
public class Day6_Program8 extends OverrideParent
{
	    Search m1()
	    {  
		System.out.println("Child m1 method");
		return new Search();
        }
        public static void main(String[] args) 
        {
		OverrideParent obj=new OverrideParent();
		SignIn s= obj.m1();
		s.signin_m1();
		Day6_Program8 obj2=new Day6_Program8();
		Search s2 =obj2.m1();
		s2.signin_m1();
		s2.search_m1();
		OverrideParent obj3=new Day6_Program8();
		SignIn s3= obj3.m1();
		s3.signin_m1();
		
        }
}