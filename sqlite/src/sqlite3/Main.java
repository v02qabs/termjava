package sqlite3;

class Main
{
    public Main()
    {
	initalize();
    }
    public static void main(String[] args)
    {
	System.out.println("Hello.!");
	new Main();
    }
    public void initalize()
    {
	try
	    {
		Class.forName("org.sqlite.JDBC");
		System.out.println("success.");
	    }
	catch(Exception error)
	    {
		System.out.println("sql init error " + error.toString());
	    }
    }
}
