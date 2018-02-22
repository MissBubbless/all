import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();       
    }
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if((request.getParameter("id").equals("1")) && (request.getParameter("password").equals("nym"))) {
			System.out.println("Login Successful");
		}
		else if	((request.getParameter("id").equals("2")) && (request.getParameter("password").equals("reddy"))) {
				System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed");
		}
		doGet(request, response);		
	try
	{	    
	     CarDemo user = new CarDemo();
	     user.setUserName(request.getParameter("un"));
	     user.setPassword(request.getParameter("pw"));

	     user = CarDemo.login(user);
		   		    
	     if (user.isValid())
	     {
		        
	          HttpSession session = request.getSession(true);	    
	          session.setAttribute("currentSessionUser",user); 
	          response.sendRedirect("userLogged.jsp"); //logged-in page      		
	     }
		        
	     else 
	          response.sendRedirect("invalidLogin.jsp"); //error page 
	} 
			
			
	catch (Throwable theException) 	    
	{
	     System.out.println(theException); 
	}}}
	
/*Setting connection Parameters

String connectionparams=”jdbc:mysql://localhost:3306/tool”;

//database name

String db=”tool”;      

//Mysql user name and password   whichever  you have given during installation

String username=”root”                   
String password=” ”                 

//Declaring classes required for Database support

Connection connection=null;
ResultSet rs;
//connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tool", root, password);*/