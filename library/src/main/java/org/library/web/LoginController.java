package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import org.library.web.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController// URL: /login
 */
public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		UserDao ud=new UserDao();
		try {
			boolean isValid = ud.validateUser(email, password);
			if(isValid)
			{
				response.sendRedirect("GetUsers");
			}
			else
			{
				response.sendRedirect("login.jsp?message='error'");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
