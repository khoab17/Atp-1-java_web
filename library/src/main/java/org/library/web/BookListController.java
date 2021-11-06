package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.library.web.dao.BookDao;
import org.library.web.model.Book;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookListController
 */
public class BookListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BookListController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		if(request.getSession().getAttribute("email")!=null)
		{
		BookDao bd=new BookDao();
		List<Book> books=new ArrayList<Book>();
		books=bd.GetBooks();
		//System.out.println(users.getFname());

		request.setAttribute("allbooks", books);
		RequestDispatcher rd=request.getRequestDispatcher("bookListStudent.jsp");
		rd.forward(request, response);
		}
		else 
			response.sendRedirect("login.jsp");
	}

}
