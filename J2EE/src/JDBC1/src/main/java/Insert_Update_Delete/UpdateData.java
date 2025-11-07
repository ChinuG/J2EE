import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String args[])
	{
		try
		{
			// 1st Step
			Class.forName("org.postgresql.Driver");
			// 2nd Step
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			// 3rd Step
			Statement stm = con.createStatement();
			
			// 4th step
			boolean b = stm.execute("Update student set name='Sumadhe' where id=13");
			System.out.println("Connection is created");
			con.close();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}
