import java.io.*;

public class chdir
{
    public chdir()
    {
    }
    public void show(String message)
    {
	System.out.println(message);
    }
    String in;
    String in1;
    String in2;
    public String mychdir()
    {
	show("移動したいディレクトリやファイル名を入力してください。");
	try
	    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		in = br.readLine();
		return in;
	    }
	catch(Exception error)
	    {
		show("入力エラー");
	    }
	return in;
    }
    String str;
    String path;
    public String Split()
    {
	show("文字列の分割");
	String s1[] = in.split(" ");
	in1 = s1[0];
	in2 = s1[1];
        str = in;
	return str;
    }
    public String chdir_change()
    {
	 path = System.getProperty("user.dir");
	 File f = new File(path);
	 try
	     {
		 show(f.getAbsolutePath());
	     }
	 catch(Exception error)
	     {
		 show("error.");
	     }
	 
	//show("変更前：" + path);
	return path;
    }
    public void setdir()
    {
	System.setProperty("usr.dir", "/data/data/com.termux/");
	System.out.println(System.getProperty("usr.dir"));
    }
    public void ch()
    {
	//setdir();
	show(System.setProperty("user.dir", "/storage"));
    }
    
    
    
}

