package November_12;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData_CallaleStatement {
	private static String URL = "jdbc:postgresql://localhost:5432/qsp";
	private static String name = "postgres";
	private static String pass = "root";
	private static Scanner sc = new Scanner(System.in);
	private static Connection con;
	static 
	{
		try 
		{
//			1st Step - Load Or Register the Driver
			Class.forName("org.postgresql.Driver");
			
//			2nd Step - Create Connection.
			con = DriverManager.getConnection(URL, name, pass);
			System.out.println("Connected");
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Driver is Loaded");
		
	}
	public static void main(String args[])
	{
		try
		{
			
//			3rd Step - 
			CallableStatement cs = con.prepareCall("call insert_student(?,?,?)");
			System.out.println("Enter Student Info ");
			System.out.print("Enter Id : ");
			cs.setInt(1, sc.nextInt());
			
			sc.nextLine();
			
			System.out.print("Enter name : ");
			cs.setString(2, sc.nextLine());
			
			System.out.print("Enter Phone No : ");
			cs.setLong(3, sc.nextLong());
			
//			4th Step -
			cs.execute();
			
//			5th Step -  Close Connection
			con.close();
//			System.out.println("Connection is Closed");)
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}





