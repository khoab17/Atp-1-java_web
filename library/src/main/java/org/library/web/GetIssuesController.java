package org.library.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.library.web.dao.IssueDao;
import org.library.web.dao.UserDao;
import org.library.web.model.Issue;
import org.library.web.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetIssuesController
 */
public class GetIssuesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetIssuesController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		if(request.getSession().getAttribute("email")!=null)
		{
		IssueDao issuedao=new IssueDao();
		List<Issue> issues=new ArrayList<Issue>();
		issues=issuedao.GetIssues();
		

		//System.out.println(users.getFname());
		
		for(int i=0;i<issues.size();i++)
		{
			System.out.print(issues.get(i).getDateOfReturn());
		}

		request.setAttribute("issues", issues);
		RequestDispatcher rd=request.getRequestDispatcher("issueList.jsp");
		rd.forward(request, response);
		}
		else 
			response.sendRedirect("login.jsp");
	}

}
