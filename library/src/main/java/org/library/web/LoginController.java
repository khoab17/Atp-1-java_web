package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import org.library.web.dao.UserDao;
import org.library.web.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Cookie;

/**
 * Servlet implementation class LoginController// URL: /login
 */
public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String rememberMe=request.getParameter("rem");
		System.out.println("Value:"+rememberMe);
		UserDao ud=new UserDao();
		try {
			User u = ud.validateUser(email, password);
			//System.out.println("Role:"+role);
			
			if(u!=null) {
			
			String role=u.getRole();
			if(role!=null) {
			
			if(role.contains("admin"))
			{
				
				HttpSession session=request.getSession();
				session.setAttribute("email", email);
				session.setAttribute("role", "admin");
				
				if(rememberMe!=null && !rememberMe.isEmpty())
                {
                    response.addCookie(new Cookie("email",email));
                }
				//System.out.print( session.getAttribute("email"));
				response.sendRedirect("Home");
				//System.out.print(email);
			}
			else if (role.contains("student"))
			{

				HttpSession session=request.getSession();
				session.setAttribute("email", email);
				session.setAttribute("role", "student");
				session.setAttribute("studentId",u.getUserId());
				
				if(rememberMe!=null && !rememberMe.isEmpty()) 
                {
                    response.addCookie(new Cookie("email",email));
                }
				response.sendRedirect("StudentHome");
			}
			else
			{
				response.sendRedirect("login.jsp?message='error'");
			}
			
			}
			}
			else {response.sendRedirect("login.jsp?message='error'");}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
