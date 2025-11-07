import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	public static void main(String args[])
	{
		try
		{
			// 1st Step
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
			// 2nd Step
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			System.out.println("Connection is created");
			// 3rd Step Create Statement
			Statement stm = con.createStatement();
			System.out.println("Created Statement");
			// 4th step
			boolean b = stm.execute("insert into student values(30, 'Abhay', 7845963210)" );
			
			int n = stm.executeUpdate("insert into student values(31, 'jkl', 222), (32, 'stu', 333)");
			System.out.println(n);
			System.out.println("Query Executed");
//			step 5
			con.close();
			System.out.println("Connection is closed");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
