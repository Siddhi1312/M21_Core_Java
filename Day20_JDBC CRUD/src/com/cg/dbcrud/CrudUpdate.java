package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudUpdate {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Siddhi@123";
		try
		{
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        String query= "UPDATE EMPLOYEE SET NAME=?,EMAIL_ID WHERE ID";
       //prepared statement used to pre compile sql queries
        PreparedStatement p=c.prepareStatement(query);
   
        p.setString(1, "SIDDHI");//name
        p.setString(2, "SIDDHI@gmail.com");//email
        p.setInt(3, 11);//password
        int r=p.executeUpdate();
        //if rpow is>0 means no of rows are present
        if(r>0)
        {
        	System.out.println("new user updated");
        	
        }
        	c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}
}
