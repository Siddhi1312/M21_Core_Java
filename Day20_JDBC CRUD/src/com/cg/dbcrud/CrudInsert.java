package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudInsert {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Siddhi@123";
		try
		{
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        String query="INSERT INTO EMPLOYEE(ID,NAME,EMAIL_ID,PASSWORD)VALUES(?,?,?,?)";
       //prepared statement used to pre compile sql queries
        PreparedStatement p=c.prepareStatement(query);
        p.setInt(1, 12);//id
        p.setInt(1, 13);
        p.setString(2, "john");//name
        p.setString(2, "jenny");
        p.setString(3, "john@gmail.com");//email
        p.setString(3, "jenny@gmail.com");
        p.setString(4, "john");
        p.setString(4, "jenny");//password
        int r=p.executeUpdate();
        //if rpow is>0 means no of rows are present
        if(r>0)
        {
        	System.out.println("new user inserted");
        	
        }
        	c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

}
}
