import java.io.*;
import java.lang.Runtime;

class exec
{
    public exec()
    {
    }
    public void carryout(InputStream is)
    {
        try
	    {
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		for(;;)
		    {
			String l = br.readLine();
			if(l == null)
			    break;
			System.out.println(l);
		    }
		
		br.close();
	    }
	catch(Exception error)
	    {
		System.out.println("exit");
	    }
	
    }
    public void getReturn(String command) throws Exception
    {
	System.out.println("carry out command: " + command);
	Runtime r = Runtime.getRuntime();
	Process p = r.exec(command);
	p.waitFor();
	carryout( p.getInputStream());
	carryout( p.getErrorStream());
    }
    
}
