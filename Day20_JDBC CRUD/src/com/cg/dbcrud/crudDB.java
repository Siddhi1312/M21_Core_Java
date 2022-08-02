package com.cg.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class crudDB {

	public static void main(String[] args) throws SQLException {
		String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
		String dbUsername="root";
		String dbPassword="Siddhi@123";
		try
		{
		
		//to check whether eclipse is connected with mysql or not
		Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		if(c!= null)
		{
			System.out.println("connection established");
			//once connection started we need to close it
			c.close();
		}

	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

}
}
