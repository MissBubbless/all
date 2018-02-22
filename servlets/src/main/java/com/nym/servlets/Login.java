package com.nym.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
	}

}
