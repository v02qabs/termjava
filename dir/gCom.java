
class gCom
{
    public gCom()
    {
	System.out.println("gCom");
    }
    public void commands(String command)
    {
	System.out.println("carry out command: " + command);
	String s1[] = command.split(" ");
        System.out.println("s1[0] : " + s1[0]);
	System.out.println("s1[1] : " + s1[1]);
	try
	    {
		exec c = new exec();
		c.getReturn(command);
	    }
	catch(Exception error)
	    {
		System.out.println("error gCom");
	    }
	
    }
}
