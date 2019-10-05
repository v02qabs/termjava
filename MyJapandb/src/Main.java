import java.sql.Connection;
import java.sql.*;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		new Main().connect();
	}
	private Connection con;
	public void connect()
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			System.out.println("connect:OK.");
			con = DriverManager.getConnection("jdbc:sqlite:../libs/sqlite3.jar");
			
		}
		catch(Exception error)
		{
			System.out.println(error.toString());
		}
	}
}
