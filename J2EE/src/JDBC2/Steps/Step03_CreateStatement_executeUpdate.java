package com.crud.CrudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Step03_CreateStatement_executeUpdate {
	public static void main(String args[])
	{
		try
		{
			// Step 01 Load or Register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully..");
			
			// Step 02 - Create Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CRUD", "postgres","root");
			System.out.println("Connection Established Successfully..");
			
			// Step 03 - Create Statement
			Statement stm = con.createStatement();
			
			// a) execute
			boolean b = stm.execute("insert into crud1 values('Black Panther','blackpanther@gmail.com','40','T Challa')");
			System.out.println(b);
			
			// b) executeUpdate
			int n = stm.executeUpdate("insert into crud1 values('Doctor Strange','doctorstrange@gmail.com','54','Stephen Strange'),('Ant man','antman@gmail.com','37','Scott Lang')");
			System.out.println(n);
		}
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
