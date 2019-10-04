import java.sql.Connection;
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
			
		}
		catch(Exception error)
		{
			System.out.println(error.toString());
		}
	}
}
