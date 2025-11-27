package November_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class ExecuteBatch {
	
	private static String URL = "jdbc:postgresql://localhost:5432/qsp";
	private static String name = "postgres";
	private static String pass = "root";
	public static void main(String args[])
	{
		try
		{
//			Step 01 - Load Or Register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded");

//			Step 02 - Create Connection
			Connection con = DriverManager.getConnection(URL, name, pass);
			System.out.println("Connection is created");
			
			
//			Step 03 - Create Statement
			Statement stm = con.createStatement();
			stm.addBatch("insert into student values(7, 'Dhoni', 7777776), (45, 'Rohit', 87654321)");
			stm.addBatch("update student set phone= 7777777 where id = 7");
			stm.addBatch("delete from student where id=45");
		
//			Step 04 - execute above Queries.
			int ar[] = stm.executeBatch();
			System.out.println(Arrays.toString(ar));
			
//			Step 05 - Close Connection.
			con.close();
			
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
}


