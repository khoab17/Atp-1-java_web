package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.library.web.dao.BookDao;
import org.library.web.model.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SavaUpdateBookController URL: SaveUpdateBook
 */
public class SavaUpdateBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SavaUpdateBookController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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
		int bookId=Integer.parseInt(request.getParameter("bookId"));
		
		Book book=new Book(bookId,title,publisher,author,numberOfCopies,
				numberOfCopies,category);
		BookDao bd=new BookDao();
		try {
		bd.Update(book);
		response.sendRedirect("GetBooks");
		}
		catch(Exception e){}
		}
		else 
		response.sendRedirect("login.jsp");
		
	}

}
