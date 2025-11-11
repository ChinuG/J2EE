package Noverber_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatement_UpdateData {
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
			PreparedStatement ps = con.prepareStatement("Update student set phone = ? where id = ?");
			System.out.print("Enter Phone No : ");
			ps.setLong(1, sc.nextLong());
			System.out.print("Enter Id : ");
			ps.setInt(2, sc.nextInt());
			
//			4th Step - execute Updates
			ps.execute();
			System.out.println("Data is Updated");
			
//			5th Step - Close Connection.
			con.close();
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
