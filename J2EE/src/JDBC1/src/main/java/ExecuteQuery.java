import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
	public static void main(String args[])
	{
		try
		{
//			1st Step - Load or Register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");
			
//			2nd Step - Create Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres", "root");
			System.out.println("Connection is created");
			
//			3rd Step - Create Statement
			Statement stm = con.createStatement();
//			Insert data into employee table
//			boolean b = stm.execute("insert into employee values(02, 'Sourabh', 68000.0, 7758011864)");
//			Delete data from employee table
//			boolean b = stm.execute("Delete from employee where id = 2");
			
//			4th Step - ResultSet Fetching data from employee table manually i.e. without using any loop.
			ResultSet rs = stm.executeQuery("Select * from employee");
			System.out.println(rs.next());
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
			System.out.println(rs.next());
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
			System.out.println(rs.next());
			
	
//			5th step Close Connection
			con.close();
			
		}
		catch(ClassNotFoundException  | SQLException e)
		{
			e.printStackTrace();
		}
		
	}
}
