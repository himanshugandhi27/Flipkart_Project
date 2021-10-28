package StepDefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBC 
{
  public void SqljdConnection( ) throws SQLException
  {
	// 1 create a connection
	
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/objects","root","root");
    System.out.println("Connection succesfully create");
    // 2 create a statement
    
     Statement stmt= con.createStatement();
     
     String query="INSERT INTO mobile VALUES(3,'TTxt_Password','')";
     String selectquery=" Select * from mobile";
     //3 Execute a query
     
     //stmt.execute(selectquery);
     
     ResultSet rs= stmt.executeQuery(selectquery);
     
     while(rs.next())
     {
    	 int sno=rs.getInt("SNO");
    	 String name=rs.getString("Name");
    	 
    	 System.out.println(sno+"  "+name);
     }
     
     // 4 Close the connection
     
     con.close();
     System.out.println("Connection closed");
    
     
  }
	
}
