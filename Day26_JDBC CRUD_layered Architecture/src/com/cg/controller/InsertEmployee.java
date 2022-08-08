package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployee {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Siddhi@123";
		try
		{
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        String query="INSERT INTO EMPLOYEE(idEmployee,Name,Salary)VALUES(?,?,?)";
       //prepared statement used to pre compile sql queries
        PreparedStatement p=c.prepareStatement(query);
        p.setInt(1, 12);//id
        p.setInt(1, 13);
        p.setString(2, "john");//name
        p.setString(2, "jenny");
        p.setFloat(3, 12000);//id
        p.setFloat(3, 13000);
       
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



