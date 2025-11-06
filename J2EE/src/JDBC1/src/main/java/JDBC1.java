import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC1 {
	public static void main(String args[])
	{
		try
		{
			// 1st Step
			Class.forName("org.postgresql.Driver");
			// 2nd Step
//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			System.out.println("Connection is created");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
