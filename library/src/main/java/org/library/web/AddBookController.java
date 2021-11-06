package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.library.web.dao.BookDao;
import org.library.web.dao.StudentDao;
import org.library.web.model.Book;
import org.library.web.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBookController URL:/AddBook
 */
public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public AddBookController() {
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		if(request.getSession().getAttribute("email")!=null)
		{
		String title=request.getParameter("title");
		String publisher=request.getParameter("publisher");
		String author=request.getParameter("author");
		int numberOfCopies=Integer.parseInt(request.getParameter("numberOfCopies"));
		String category=request.getParameter("category");

		//Student s=new Student(fname,lname,gender,dateOfBirth,contact,email);
		Book b=new Book( title,publisher, author, numberOfCopies,
			 numberOfCopies, category);
		BookDao bd=new BookDao();
		
		try {
			bd.Insert(b);
			response.sendRedirect("GetBooks");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else 
			response.sendRedirect("login.jsp");

	}

}
