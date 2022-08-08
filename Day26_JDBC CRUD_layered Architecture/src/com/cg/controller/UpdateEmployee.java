package com.cg.controller;

 //package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmployee {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Siddhi@123";
		try
		{
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        String query= "UPDATE EMPLOYEE SET Salary=?, WHERE idEmployee=?";
       //prepared statement used to pre compile sql queries
        PreparedStatement p=c.prepareStatement(query);
   
       // p.setFloat(3, 56000f);//name
        p.setInt(1, 13);//email
        p.setFloat(2, 56000f);
        
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



