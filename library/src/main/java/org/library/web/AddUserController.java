package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.library.web.dao.BookDao;
import org.library.web.dao.UserDao;
import org.library.web.model.Book;
import org.library.web.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUserController URL AddUser
 */
public class AddUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddUserController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(request.getSession().getAttribute("email")!=null)
		{
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String dateOfBirth=request.getParameter("dateOfBirth");
		String contact=request.getParameter("contact");
		String password=request.getParameter("password");
	
		//Student s=new Student(fname,lname,gender,dateOfBirth,contact,email);
		User u=new User(fname,lname,gender,dateOfBirth,contact, email,password);
		//BookDao bd=new BookDao();
		UserDao ud=new UserDao();
		
		try {
			ud.Insert(u);
			response.sendRedirect("GetUsers");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		}
		else 
			response.sendRedirect("login.jsp");
		
		
	}

}
