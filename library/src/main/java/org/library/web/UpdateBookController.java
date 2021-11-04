package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.library.web.dao.BookDao;
import org.library.web.model.Book;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateBookController URL /UpdateBook
 */
public class UpdateBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateBookController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id")) ;
		
		Book book=new Book();
		BookDao bd=new BookDao();
		book=bd.GetBook(id);
		
		request.setAttribute("book", book);
		RequestDispatcher rd=request.getRequestDispatcher("editBook.jsp");
		rd.forward(request, response);
		
		
		System.out.println(id);
		System.out.println(book.getPublisher());
		
		
	}

}
