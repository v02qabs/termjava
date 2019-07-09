public class Main
{
	public Main()
	{
	}
	public void changeDir()
	{
		sysp p = new sysp();
		String path = "/storage";
		System.out.println(p.getPro(path));
	}
	public static void main(String[] args)
	{
		Main m = new Main();
		m.changeDir();
	}

}

