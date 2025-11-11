package Noverber_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement_DeleteData {
	private static String URL = "jdbc:postgresql://localhost:5432/qsp";
	private static String name = "postgres";
	private static String pass = "root";
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		try
		{
//			1st Step - Load or Register the Driver.
			Class.forName("org.postgresql.Driver");
			
//			2nd Step - Create Connection.
			Connection con = DriverManager.getConnection(URL, name, pass);
			
//			3rd Step - Create Statement.
			PreparedStatement ps = con.prepareStatement("delete from student where id = ?");
			System.out.print("Enter Id : ");
			ps.setInt(1, sc.nextInt());
			
//			4th Step - execute
			ps.execute();
			System.out.println("Data Deleted");
			
//			5th Step - Close Connection.
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
