package Insert_Update_Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class InsertDataUsingExecuteQuery {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
//			1st step - Load or Register the Driver
			Class.forName("org.postgresql.Driver"); // forName is static method i.e Class.forName("FullyQualifiedClassNameOfDriver")
			System.out.println("Driver is Loaded");
			
//			2nd step - Create Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			System.out.println("Connected");
			
//			3rd Step - To fetch the data
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
			
			System.out.print("Enter Id : ");
			ps.setInt(1,  sc.nextInt());
			sc.nextLine();
			System.out.print("Enter Name : ");
			ps.setString(2, sc.nextLine());
			System.out.print("Enter Phone Number : ");
			ps.setLong(3, sc.nextLong());
			
//			4th step - to execute
			ps.execute();
			System.out.println("Inserted");
			
//			5th step
			con.close();
			System.out.println("Connection is Closed");
			
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}

