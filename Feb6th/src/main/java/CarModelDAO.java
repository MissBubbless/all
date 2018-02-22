import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CarModelDAO {

	private static String connectionUrl=" ";
	private static Properties dbprops = null;
	static
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		System.out.println("");
		 dbprops = DatabaseProperties.getInstance().getProperties();
		connectionUrl = "jdbc:mysql://" 
				+ dbprops.getProperty("server") 
				+ ":" + dbprops.getProperty("port")
				+ "/" + dbprops.getProperty("database")+"?autoReconnect=true&useSSL=false";
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	 public static Connection getConnection() throws Exception
	{
		Connection con = (Connection) DriverManager.getConnection(connectionUrl, dbprops.getProperty("userid"), dbprops.getProperty("password"));
        return con;
	}
	 
	 public void select() throws SQLException 
	 {
		 Connection con=null;
		 try {
			 con=getConnection();
			 java.sql.PreparedStatement stmt=(java.sql.PreparedStatement) con.prepareStatement("select * from carmodel");
			 ResultSet rs=stmt.executeQuery();
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+" "+rs.getString(2));
			 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
	 
	 }
		 finally {
			 if(con!=null) {
				 con.close();
			 }
		 }
		 
	 }
	 
}
