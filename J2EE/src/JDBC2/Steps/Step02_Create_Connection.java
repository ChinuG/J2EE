package com.crud.CrudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step02_Create_Connection {
	public static void main(String args[])
	{
		try {
			//	Step 01 - Load Or Register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully..");
			
			//	Step 02 - Create Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crud1?user=postgres&password=root");
			System.out.println("Connection Established Successfully..");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
