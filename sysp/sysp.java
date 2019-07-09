public class sysp
{
	public sysp()
	{
	}
	public String getPro(String path)
	{
		System.setProperty("usr.dir", path);
		String s = System.getProperty("usr.dir");
		return s;
	}
}
