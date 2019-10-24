import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class sql_commands {

	private String line;
	public void inputdata()
	{
		System.out.print("search for the word...: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			line = br.readLine();
			search_for(line);
		} catch (Exception e) {
			
			System.out.println("error");
		}

	}
	private void search_for(String line){
		try
		{
			Connection con;

			con = DriverManager.getConnection("jdbc:sqlite:../db/words.db");

			// TODO Auto-generated method stub
			String select_sql = "select * from words where words in('"+ line + "')";
			Statement st = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery(select_sql);
			while(rs.next())
			{
				System.out.println("line: " + line);
				//setString(line);
			}
			String not_exists = "select * from words where not exists(select * from words where words.words=" + line + ")";
			st.executeQuery(not_exists);
			System.out.println("FAILED");
			st.close();
			rs.close();
		}
		catch(SQLException error)
		{
			System.out.println("success");
		}
	}
}
