package com.cg.controller;

	//package com.cg.dbcrud;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class RetrieveEmployee {

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
	        	int idEmployee=r.getInt(1);
	        	String Name=r.getString(2);
	        	Float Salary=r.getFloat(3);
	        
	        	String output="User :%d %s %f";
	        	System.out.println(String.format(output,idEmployee,Name,Salary));
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



