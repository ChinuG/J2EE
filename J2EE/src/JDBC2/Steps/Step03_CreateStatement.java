package com.crud.CrudOperation;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Step03_CreateStatement {
	
	public static void main(String args[])
	{
		try {
			//	Step 01 - Load Or Register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			
			//	Step 01 - Create Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CRUD","postgres","root");

			System.out.println("Connection Established Successfully..");
			
			//	Step 03 - Create Statement 
			//  a) execute()
			Statement stm = con.createStatement();
			
			boolean b = stm.execute("insert into crud1 values('Clint Barton','clintbarton@gmail.com','37','Hawkeye')");
			System.out.println(b);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
