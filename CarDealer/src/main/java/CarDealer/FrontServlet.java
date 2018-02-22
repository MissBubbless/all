package CarDealer;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FrontServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<CarModel> CM=new ArrayList<CarModel>();
		
		//1.CreateSession
		HttpSession session = request.getSession();
		User u=(User) session.getAttribute("user");
		String uname=u.getUsername();
		String pwd=u.getPassword();
		
		
		if(new DataAccess().checkCredentials(uname, pwd))
		{
			System.out.println("inside check servlet");
			ResultSet rs=new DataAccess().getCars();
					try {
						while(rs.next()) {
							CarModel c = new CarModel();
							c.setBrand(rs.getString(2));
							c.setColour(rs.getString(3));
							c.setCondition(rs.getBoolean(4));
							c.setPrice(rs.getInt(5));
							c.setSeries(rs.getString(6));
							c.setVin(rs.getInt(1));
							CM.add(c);

						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("after catch block");

					// AFTER VALIDATING SEND THE DATA TO NEXT RESOURSE
					request.setAttribute("carlist", CM);
					session.setAttribute("carlist", CM);
					// FORWARD REQUEST TO NEXT RESOURSE
					RequestDispatcher RD = request.getRequestDispatcher("Cars.jsp");
					RD.forward(request, response);
						}
					}
}
