import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Date d = new Date();
	    System.out.println("date = " + d);
			System.setProperty("usr.dir", "/storage/sdcard0");
			System.out.println("get = " + System.getProperty("usr.dir"));
	}
}
