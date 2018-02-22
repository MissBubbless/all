

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataAccess {
String url="jdbc:mysql://localhost:3306/car_dealer";
String uname="root";
String pass="nymisha";
String sql="select * from login_details where Name=? and password= ?";
String sql2="select * from carmodel";
String sql3="select * from carhistory";

public boolean checkCredentials(String username,String password)
{
	try {
		System.out.println(username);
		System.out.println(password);
		Class.forName("com.mysql.jdbc.Driver");
		//1.Get Connection to DB
		Connection myConn=DriverManager.getConnection(url,uname,pass);
		//2.Create a statement
		PreparedStatement myStmt = myConn.prepareStatement(sql);
		myStmt.setString(1, username);
		myStmt.setString(2, password);
		//3.Excute SQL query
		ResultSet myRS=myStmt.executeQuery();
		if(myRS.next()) {
			System.out.println("this is returning true in the senese that record is in the DB");
			return true;
		}
	}
	catch(Exception e) {
	e.printStackTrace();
	}
return false;
	}
//GETTING THE CARS
	public ResultSet getCars() {
		ResultSet myRS = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			Connection myConn = DriverManager.getConnection(url, uname, pass);

			// 2. Create a statement
			PreparedStatement myStmt = myConn.prepareStatement(sql2);

			// 3. Execute SQL query
			myRS = myStmt.executeQuery();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myRS;

	}
}
