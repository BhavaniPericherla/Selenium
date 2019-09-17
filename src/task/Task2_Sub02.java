package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Task2_Sub02 {
	static Connection conn;
	public static void main(String[] args) throws SQLException, InterruptedException{

		//connected to data base
		String ConnectionUrl = "jdbc:sqlserver://192.168.1.40:1433;databaseName=Practice_QA;user=QApractice;password=p6@c3ice";	
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver()); 
		conn = DriverManager.getConnection(ConnectionUrl);
		Statement st = conn.createStatement();
		/* Before Update : Employee Details
		String sqlStr = "select * from Employee where empId =101";
		ResultSet rs = st.executeQuery(sqlStr);
		ArrayList<String> actualresult = null;

		while (rs.next()) 
		{
			actualresult = new ArrayList<String>();
			actualresult.add(rs.getString("EmpId"));
			actualresult.add(rs.getString("EmpName"));
			actualresult.add(rs.getString("DOJ"));
			actualresult.add(rs.getString("Salary"));
			actualresult.add(rs.getString("DeptID"));
			System.out.println("Before Update Employee details:"+actualresult);
		}
               */
		//updating Employee Table
		//System.out.println("pass");
		try {   
			String sqlStr1 = "UPDATE Employee SET EmpName ='Vani',Salary ='23455' where empId =101";

			PreparedStatement updateEXP = conn.prepareStatement(sqlStr1);
			//System.out.println("Update"+sqlStr1);
			updateEXP.executeUpdate();
			System.out.println("Updated");
		} 
		catch (SQLException e ) {
			System.out.println("update not successful");   
			System.out.println(e);
		}
		
		Thread.sleep(5000);
		String sqlStr2 = "select * from Employee where empId =101";
		ResultSet rs1 = st.executeQuery(sqlStr2);
		ArrayList<String> afterupdate = null;
		while (rs1.next()) 
		{
			afterupdate = new ArrayList<String>();
			afterupdate.add(rs1.getString("EmpId"));
			afterupdate.add(rs1.getString("EmpName"));
			afterupdate.add(rs1.getString("DOJ"));
			afterupdate.add(rs1.getString("Salary"));
			afterupdate.add(rs1.getString("DeptID"));
		}
		System.out.println("After Update Employee details:\n Actual Result:"+afterupdate);
		// Declaring Actual Result 
		ArrayList<String> expectedresult = new ArrayList<String>();
	        expectedresult.add("101");
	        expectedresult.add("Vani");
	        expectedresult.add("2010-10-12");
	        expectedresult.add("23455");
	        expectedresult.add("1dfgf");
	       System.out.println("Expected Results:"+expectedresult);
		//Comparing actual result with updated values in DB --- First Approach
	   /*    for (String act: afterupdate) {
	   		if (expectedresult.contains(act)) {
	   			System.out.println("Pass:"+act);
	   			
	   		} else {
	   			//ArrayList<String> expResult = expectedresult;
	   			System.out.println("Actual Result : "+act );
	   		}
	       }
	       */
	       for (int i=0; i<afterupdate.size();i++) 
	    	   {
	    		   if(expectedresult.contains(afterupdate.get(i)))
	    		   {
	    		        System.out.println("Exist : "+afterupdate.get(i));
	    		   }
	    		   else{
	    		         System.out.println("Actual Value : "+afterupdate.get(i));
	    		         System.out.println("Expected Value : "+expectedresult.get(i));
	    		       }
	    		    }
	     conn.close();
	}
   }



