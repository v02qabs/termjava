package chdir;

class Main
{
    public Main()
    {
	init();
    }
    public static void main(String[] args)
    {
	System.out.println("Hello.");
	new Main();
    }
    public void init()
    {
	chdir c = new chdir();
	c.changedir("/data/data/com.termux/");
	c.chdir2();
    }
}