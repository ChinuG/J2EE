package Noverber_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement_FetchData {
	private static String URL = "jdbc:postgresql://localhost:5432/qsp";
	private static String name = "postgres";
	private static String pass = "root";
	
	public static void main(String args[])
	{
		try
		{
//			Step 01 - Load Or Register the Driver.
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
			
//  		Step 02 - Create Connection.			
			Connection con = DriverManager.getConnection(URL, name, pass);

//			Step 03 - Crate Statement.
			PreparedStatement ps = con.prepareStatement("Select * from student");
			
//			4th Step - get resultSet is used to create object and display the data from database.
//			To fetch the data when developer don't no which query to execute so we create object of ResultSet. i.e. Generic Query execute.
			ResultSet rs = ps.executeQuery(); 
			while(rs.next())
			{
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getLong("Phone"));
				System.out.println("---------------------");
			}
			
//			5th Step - Close Connection
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}

