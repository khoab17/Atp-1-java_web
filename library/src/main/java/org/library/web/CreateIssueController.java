package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;

import org.library.web.dao.IssueDao;
import org.library.web.model.Issue;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateIssueController URL: CreateIssue
 */
public class CreateIssueController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CreateIssueController() {
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
		String dateOfIssue=request.getParameter("dateOfIssue");
		String dateOfReturn=request.getParameter("dateOfReturn");
		int bookId=Integer.parseInt(request.getParameter("bookId"));
		int studentId=Integer.parseInt(request.getParameter("studentId"));
		
		//System.out.print(dateOfIssue+"  "+dateOfReturn+"  "+bookId+"  "+studentId);
		
		Issue i=new Issue(dateOfIssue,dateOfReturn,bookId,studentId);
		IssueDao ir=new IssueDao();
		try {
			ir.Insert(i);
			response.sendRedirect("GetBooks");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else response.sendRedirect("login.jsp");

	}

}
