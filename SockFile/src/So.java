import java.net.*;
import java.io.*;

class So
{
	public So()
	{
	}
	public void Server(String fpath)
	{
		System.out.println("Starting terport");
		try
		{
			byte b[] = new byte[150];
			ServerSocket ss = new ServerSocket(8080);
			System.out.println("Getting File Type Path: ");
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			OutputStream os = new FileOutputStream(fpath);
			int flen;
			while((flen=is.read(b))>0)
			{
				os.write(b,0,flen);
			}
			os.flush();
			os.close();
			is.close();
			ss.close();

		}
		catch(Exception e)
		{
			System.out.println("server error");
		}

	}
	public void Client()
	{
		System.out.println("start send file...");
		String fpath = "item.txt";
		File f = new File(fpath);
		byte b[] = new byte[100];
		try
		{
			Socket s = new Socket("localhost", 8080);
			InputStream is = new FileInputStream(f);
			OutputStream os = s.getOutputStream();
			int flen;
			while((flen = is.read(b))>0)
			{
				os.write(b, 0, flen);
			}
			System.out.println("getting...");
			os.flush();
			os.close();
			is.close();
			s.close();
		}
		catch(Exception error)
		{
			System.out.println("Error!");
		}
	}
}

