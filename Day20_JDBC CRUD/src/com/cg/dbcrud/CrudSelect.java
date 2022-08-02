package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudSelect {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Siddhi@123";
		try
		{
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
        String query= "SELECT * FROM EMPLOYEE";
       //prepared statement used to pre compile sql queries
        Statement s=c.createStatement();
        ResultSet r=s.executeQuery(query);
        int count =0;
        while (r.next())
        {
        	int id=r.getInt(1);
        	String name=r.getString(2);
        	String email=r.getString(3);
        	String password=r.getString(4);
        	String output="User :%d %s %s %s";
        	System.out.println(String.format(output,id,name,email,password));
        }
        //if row is>0 means no of rows are present
        
        	c.close();
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	

	}

}
