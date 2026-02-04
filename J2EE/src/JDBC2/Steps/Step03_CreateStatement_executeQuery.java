package com.crud.CrudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Step03_CreateStatement_executeQuery
{
	public static void main(String args[])
	{
		try {
			//	Step 01 - Load or Register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Dirver loaded Successfully..");
			
			// 	Step 02 - Create Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CRUD", "postgres","root");
			System.out.println("Connection Established Successfully..");
			System.out.println(con);
			
			// 	Step 03 - Create Statement
			Statement stm = con.createStatement();
			// a) execute()
			boolean b = stm.execute("insert into crud1 values('Spider-man','spiderman@gmail.com','37','Peter Parker')");
			System.out.println(b);
			
			// b) executeUpdate()
			int n = stm.executeUpdate("insert into crud1 values('Falcon','falcon@gmail.com','32','Sam Wilson'),('Winter Soldier','wintersoldier@gmail.com','150','Bucky Barnes')");
			System.out.println("Insert Query execute Successfully..");
			
			//	c) executeQuery()
			ResultSet rs = stm.executeQuery("Select * from crud1");
			System.out.println("Fetch ResultSet / Data Successfully..");
			System.out.println(rs.next() + " : 1");
			System.out.println(rs.getString(1) + " : 2");
			System.out.println(rs.getString(2) + " : 3");
			System.out.println(rs.getString(3) + " : 4");
			System.out.println(rs.getString(4) + " : 5");
			
			System.out.println("**********************************");
			
			System.out.println(rs.next() + " : 1");
			System.out.println(rs.getString(1) + " : 2");
			System.out.println(rs.getString(2) + " : 3");
			System.out.println(rs.getString(3) + " : 4");
			System.out.println(rs.getString(4) + " : 5");

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	