package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.library.web.dao.RequestDao;
import org.library.web.model.Request;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class RequestBookController
 */
public class RequestBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RequestBookController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		String edition=request.getParameter("edition");
		String note=request.getParameter("note");
		
		HttpSession session=request.getSession(false);
		int studentId=(Integer)session.getAttribute("studentId");
		
		Request req=new Request(title,author,edition,note,"pending",studentId);
		
		RequestDao rd=new RequestDao();
		try {
			rd.Insert(req);
		}
		catch(Exception e) {}
		
	}

}
