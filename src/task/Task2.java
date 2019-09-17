package task;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Task2 {
	static Connection conn;
	public static void main(String[] args) throws SQLException{
		String ConnectionUrl = "jdbc:sqlserver://192.168.1.40:1433;databaseName=Practice_QA;user=QApractice;password=p6@c3ice";	
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver()); 
		conn = DriverManager.getConnection(ConnectionUrl);
		  //Executing SQL query and fetching the result
        Statement st = conn.createStatement();
        
        String sqlStr = "select * from Employee where EmpName = 'Bhavani'";
      //  PreparedStatement ps = conn.prepareStatement(sqlStr);
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
        
		System.out.println("Actual Employee details:"+actualresult);
        }
		//if(a1.contentEquals(c))
        ArrayList<String> expectedresult = new ArrayList<String>();
        expectedresult.add("104");
        expectedresult.add("Bhavani");
        expectedresult.add("1989-05-12");
        expectedresult.add("100000");
        expectedresult.add("3");
       System.out.println("Expected Employee details:"+expectedresult);
       if(actualresult.equals(expectedresult))
       {  
    	 System.out.println("Pass");
       }
       else 
       {
    	   System.out.println("Fail");
       }
       conn.close();
	}
	}
		

