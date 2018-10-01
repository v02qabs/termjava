import java.io.*;

class Main
{
	public Main()
	{
		initalize();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello.");
		new Main();
	}
	public void initalize()
	{
		chdir ch = new chdir();
		ch.setdir();
		getls();
	}
    public void getls()
    {
	try
	    {
		System.out.println("Your change dir path: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dir = br.readLine();
		System.setProperty("usr.dir", dir);
		//exec e = new exec();
		getCommand(dir);
	    }
	catch(Exception error)
	    {
		System.out.println("error.");
	    }
	
    }
    public void getCommand(String command)
    {
	gCom gc = new gCom();
	gc.commands(command);
    }
}

