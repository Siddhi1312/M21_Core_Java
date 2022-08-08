package com.cg.controller;


	//package com.cg.dbcrud;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DeleteEmployee {

		public static void main(String[] args) {
			String dbURL="jdbc:mysql://127.0.0.1:3306/capgemini";
			String dbUsername="root";
			String dbPassword="Siddhi@123";
			try
			{
			Connection c=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
	        String query="DELETE FROM EMPLOYEE WHERE idEmployee=?";
	       //prepared statement used to pre compile sql queries
	        PreparedStatement p=c.prepareStatement(query);
	        p.setInt(1, 12);//id
	        
	        int r=p.executeUpdate();
	        //if rpow is>0 means no of rows are present
	        if(r>0)
	        {
	        	System.out.println("user deleted");
	        	
	        }
	        	c.close();
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}

		}

	}


