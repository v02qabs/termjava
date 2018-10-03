package chdir;

import java.io.*;

class chdir
{
    public chdir()
    {
    }
    public void changedir(String command)
    {
	System.out.println("command: "+ command);
	try
	    {
	    }
	catch(Exception error)
	    {
		System.out.println(error.toString());
	    }
    }
    public void chdir2()
    {
	String line = getLine();
	getCommand(line);
    }
    
    public void printStream(InputStream is)
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(is));

	try
	    {
		for(;;)
		    {
			String l = br.readLine();
			if(l==null)
			    break;
			System.out.println(l);

		    }
	    }
	catch(Exception error)
	    {
		System.out.println(error.toString());
	    }
    }
    public void getCommand(String command)
    {
	String s[] = command.split(" ");
	String s0 = s[0];
	if(s0.equals("exit"))
	   {
	       System.exit(0);
	   }
	else if(s0.equals("cd"))
	    {
		try
		    {
			String s1 = s[1];
		        System.setProperty("usr.dir", s1);
			String fpath = System.getProperty("usr.dir");
			System.out.println("dir ; " + fpath);
		        Runtime r = Runtime.getRuntime();
			Process p = r.exec("ls -a " + fpath);
			printStream(p.getInputStream());
			printStream(p.getErrorStream());
			chdir2();
		    }
		catch(Exception error)
		    {
			System.out.println("null");
			chdir2();
		    }
		
		   
	    }
	else
	    {
		chdir2();
	    }
	
	
	
    }
    public String line;
    public String getLine()
    {
       try
	   {
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       line = br.readLine();
	       System.out.println("line : " + line);
	       return line;
	   }
       catch(Exception error)
	   {
	       System.out.println(error.toString());
	   }
       return line;
    }
    
    
}
