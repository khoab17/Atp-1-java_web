package org.library.web;

import java.io.IOException;
import java.util.List;

import org.library.web.dao.IssueDao;
import org.library.web.model.Issue;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class BorrowedBookController
 */
public class BorrowedBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BorrowedBookController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession(false);
		int studentId=(Integer)session.getAttribute("studentId");
		
		IssueDao issud=new IssueDao();
		List<Issue> issues=issud.GetIssues(studentId);
		
		request.setAttribute("issues", issues);
		RequestDispatcher rd=request.getRequestDispatcher("borrowList.jsp");
		rd.forward(request, response);
	}

}
