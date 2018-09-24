class Main
{
    public Main()
    {
	InputExec();
    }
    public static void main(String[] args)
    {
	System.out.println("Hello.");
	new Main();
    }
    public void InputExec()
    {
	System.out.println("exec...");
	Exe c = new Exe();
	c.getCommand();
    }
}
