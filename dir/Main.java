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
		ch.mychdir();
		//ch.show();
		ch.Split();

		ch.setdir();
	}

}

