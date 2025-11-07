import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
	public static void main(String args[])
	{
		try
		{
			// 1st Step
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded");
			// 2nd Step
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			System.out.println("Connection is created");
			//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			// 3rd Step
			Statement stm = con.createStatement();
			
			// 4th step
			boolean b = stm.execute("Delete from student where id = 14");
			System.out.println("Updated query successfully");
			con.close();
			System.out.println("");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
