import java.io.*;

class Exe
{
    public Exe()
    {
    }
    public void getCommand()
    {
	try
	    {
		Runtime r = Runtime.getRuntime();
		//String command[] = {"ls", "-a"};
		Process p;
		p = r.exec("cd /data/data/com.termux/files/home");
		p.waitFor();
		InputStream is = p.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		while(true)
		    {
			String line = br.readLine();
			if(line==null)
			    System.exit(0);
			System.out.println("line: " + line);
		    }
	    }
	catch(Exception error)
	    {
		System.out.println(error.toString());
	    }
	
    }
}
