//Single dimension array :Creating Array of Predefined class
package seleniumbatch;

public class Day4_Program1_Array1 
{
	public static void main(String[] args)   
    {
	    Day4_Program1_Array_Base[] e = new Day4_Program1_Array_Base[5];   
		e[0]=new Day4_Program1_Array_Base(111,"ratan");  
        e[1]=new Day4_Program1_Array_Base(222,"anu");   
        e[2]=new Day4_Program1_Array_Base(333,"sravya"); 
        e[3]=new Day4_Program1_Array_Base(109);
        System.out.println("Values in Day4_Program1_Array_Base Employee class array");
    for (Day4_Program1_Array_Base ee:e)   
    { 
    	if (ee instanceof Day4_Program1_Array_Base)    
        { 
    System.out.println(ee.eid+"----"+ee.ename);    
    }   
    if (ee==null)    
    { 
    	System.out.println(ee);    
    }     
    }  
} 
}




