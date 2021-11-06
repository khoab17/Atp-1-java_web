package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.library.web.dao.UserDao;
import org.library.web.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetUsersController, URL: pattern /GetUser
 */
public class GetUsersController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(request.getSession().getAttribute("email")!=null)
		{
		UserDao ud=new UserDao();
		List<User> users=new ArrayList<User>();
		users=ud.getUsers();
		//System.out.println(users.getFname());
		request.setAttribute("allusers", users);
		RequestDispatcher rd=request.getRequestDispatcher("users.jsp");
		rd.forward(request, response);
		}
		else 
			response.sendRedirect("login.jsp");

	}



}
