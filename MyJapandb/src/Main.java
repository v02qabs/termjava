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
			System.setProperty("usr.dir",".");
			String test_path = System.getProperty("usr.dir");
			System.out.println("Path: " + test_path);
			
		}
		catch(Exception error)
		{
			System.out.println(error.toString());
		}
	}
}
