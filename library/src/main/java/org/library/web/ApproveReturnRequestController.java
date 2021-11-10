package org.library.web;

import java.io.IOException;

import org.library.web.dao.IssueDao;
import org.library.web.model.Issue;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApproveReturnRequestController URL: /ApproveReturnRequest
 */
public class ApproveReturnRequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ApproveReturnRequestController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			
			int id=Integer.parseInt(request.getParameter("id"));
			IssueDao issued=new IssueDao();
			//String status="approved";
			try {
			issued.UpdateReturnStatus(id);
			response.sendRedirect("ReturnRequestAdmin");
			}
			catch(Exception e) {}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
